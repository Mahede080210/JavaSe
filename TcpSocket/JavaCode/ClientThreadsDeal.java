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
 * ����ʵ����TCPЭ��˫���еĿͻ��ˣ�����ʵ�ֶ��߳�
 * @author DELL
 *2017-12-11
 */
public class ClientThreadsDeal extends Thread {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private String Ip=null;
	private int port;
	
	public ClientThreadsDeal(Socket socket)
	{
		try
		{
			this.socket =socket;
			
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())),true );
			
			start();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		try{    
			while(true)
			{
				//String str=keyboard.nextLine();
				String str="Hello,���ǿͻ���";
				out.println(str);              //��������˷�����Ϣ
				
				String info=in.readLine();            //���ܷ���˵Ļ�Ӧ
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
	
}
