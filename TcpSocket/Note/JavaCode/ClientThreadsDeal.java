import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

import org.ietf.jgss.Oid;

/**
 * ����ʵ����TCPЭ��˫���еĿͻ��ˣ�����ʵ�ֶ��߳�
 * @author DELL
 *2017-12-11
 */
public class ClientThreadsDeal extends Thread {
	Scanner keyboard=new Scanner(System.in);
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
			
			//��IO����������������
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())),true );
			
			//�����߳�
			start();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//�߳̾��幤������
	public void run()
	{
		try{   
			//���к�
			System.out .println("�ͻ���>>Hello,I am �ͻ���!!");
			out.println("Hello,I am �ͻ���!!" );
			//�����ʺ�
			String str0=in.readLine();
			System.out .println("�����>>"+str0);
			
			//��ʾʱ��
			System.out.println();
			System.out .println("--------ʱ��>>"+new Date()+"---------------");
			System.out.println();
			while(true)
			{
				//�������������Ϣ��������������
				System.out.print("�ͻ���>>");
				String str1=keyboard.nextLine();
				out.println(str1);
				
				//��ʾʱ��
				System.out.println();
				System.out .println("--------ʱ��>>"+new Date()+"---------------");
				System.out.println();
				
				//�Ƿ����������־
				if(str1.equalsIgnoreCase("Quit"))
				{
					break;
				}
				//���ܷ������Ϣ
				String str2=in.readLine();
				System.out . println("������>>"+str2);	
				
				//�ж��Ƿ�����Ự
				if(str2.equalsIgnoreCase("Quit"))
				{
					break;
				}
				
				//��ʾʱ��
				System.out.println();
				System.out .println("--------ʱ��>>"+new Date()+"---------------");
				System.out.println();
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
