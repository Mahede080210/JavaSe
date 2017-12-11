import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.ietf.jgss.Oid;

/**
 * 该类实现了TCP协议双方中的客户端，并且实现多线程
 * @author DELL
 *2017-12-11
 */
public class ThreadClientCode extends Thread {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private String Ip=null;
	private int port;
	
	public ThreadClientCode(String Ip,int port)
	{
		this.Ip=Ip;
		this.port=port;
	}
	
	public void getConnection()
	{
		try{
			socket=new Socket(Ip, port);        //连接服务器
			while(true)
			{
				in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream())),true );
				
				//Scanner keyboard=new Scanner(System.in);
				//String str=keyboard.nextLine();
				String str="Hello,我是客户端";
				out.println(str);              //向服务器端发送信息
				
				String info=in.readLine();            //接受服务端的回应
				//System.out.println("Server message>>"+info);
			}
		}
		catch(IOException e1){
			e1.printStackTrace();
		}
		finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.close();
		}
	}
	
	public static void main(String[] args)
	{
		ThreadClientCode newOne=new ThreadClientCode("localhost", 3333);
		newOne.getConnection();
	}
	
}
