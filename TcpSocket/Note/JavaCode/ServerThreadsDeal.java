import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * ����ʵ��TCPЭ��˫���ķ���������
 * @author DELL
 *2017-12-11
 */
public class ServerThreadsDeal  extends Thread{
	Scanner keyboard = new Scanner(System.in);
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ServerThreadsDeal(Socket socket)
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
	
	//�߳���Ҫִ�еľ�������
	public void run()
	{
		try{
			System.out.println("�����ӵ��ͻ��ˣ��ͻ���Ϊ " + socket);
			System.out .println();
			System.out .println("-------------------------------------");
			System.out .println("-------------------------------------");
			System.out .println("������ʼ>>");
			
			//��ʾ������ʼ����
			System.out.println();
			System.out .println("--------ʱ��>>"+new Date()+"---------------");
			System.out.println();
			
			//���к�
			String str0 = "Hello,���Ƿ����,�ܿ��Ľӵ������Ϣ��";
			out.println(str0);
			System.out .println("�����>>"+str0);
			
			//�����к�
			String str1=in.readLine();
			System.out .println("�ͻ���>>"+str1);
			
			//�ж��Ƿ�����Ự
			if (!(str1.equalsIgnoreCase(("quit")))) 
			{
				while (true) {

					String str2 = in.readLine();
					System.out.println("�ͻ���>> " + str2);
					
					//��ʾ�м�ʱ��
					System.out.println();
					System.out .println("--------ʱ��>>"+new Date()+"---------------");
					System.out.println();

					if (str2.equalsIgnoreCase(("quit"))) 
					{
						System.out . println("-------------�Ự����-----------------");
						break;
					}
					// �ظ��ͻ���
					System .out .print("�����>>");
					String str4 = keyboard.nextLine();
					out.println(str4);
					
					//�ж��Ƿ�����Ự
					if (str4.equalsIgnoreCase(("quit"))) 
					{
						System.out . println("-------------�Ự����-----------------");
						break;
					}
					
					//��ʾ��������
					System.out.println();
					System.out .println("--------ʱ��>>"+new Date()+"---------------");
					System.out.println();
				}
			}
			else
			{
				System.out . println("-------------�Ự����-----------------");
			}
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


