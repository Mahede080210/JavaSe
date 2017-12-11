import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.DocFlavor.STRING;

/**
 * ����ʵ��TCPЭ��˫���ķ���������
 * @author DELL
 *2017-12-11
 */
public class ThreadServerCode  extends Thread{
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ThreadServerCode(Socket socket)
	{
			this.socket=socket;               //��ÿͻ���socket�ľ��
			try
			{
				//��IO��
				in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out=new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream())),true);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			//�����߳�
			start();
	}
	public void run()
	{
		try{
			//���ܿͻ��˵���Ϣ�����
			String clientInfo=in.readLine();                                   
			System.out.println("client message>>"+clientInfo);
			
			String string="hello,���Ƿ����";
			out.println(string);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
			{
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


