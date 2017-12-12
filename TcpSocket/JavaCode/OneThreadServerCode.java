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

public class OneThreadServerCode { // ���ö˿ں�

	public static int portNo = 3333;

	public static void main(String[] args) throws IOException

	{
		Scanner keyboard = new Scanner(System.in);
		ServerSocket s = new ServerSocket(portNo);
		
		//��ʾ��ʼʱ��
		System.out.println();
		System.out .println("--------ʱ��>>"+new Date()+"---------------");
		System.out.println();
		
		System.out.println("����ʼ��������\n���ڵȴ��˿͵ĵ���������");

		// ����,ֱ���пͻ�������
		Socket socket = s.accept();
		try {
			System.out.println("�����ӵ��ͻ��ˣ��ͻ���Ϊ " + socket);
			System.out .println();
			System.out .println("-------------------------------------");
			System.out .println("-------------------------------------");
			System.out .println("������ʼ>>");
			
			//��ʾ������ʼ����
			System.out.println();
			System.out .println("--------ʱ��>>"+new Date()+"---------------");
			System.out.println();
			
			// ����IO���
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),
					true);
			
			//���к�
			String str0 = "Hello,���Ƿ����,�ܿ��Ľӵ������Ϣ��";
			out.println(str0);
			System.out .println("�����>>"+str0);
			
			//�����к�
			String str1=in.readLine();
			System.out .println("�ͻ���>>"+str1);
			
			while (true) {

				String str2 = in.readLine();
				System.out.println("�ͻ���>> " + str2);
				
				//��ʾ�м�ʱ��
				System.out.println();
				System.out .println("--------ʱ��>>"+new Date()+"---------------");
				System.out.println();

				if (str2.equalsIgnoreCase(("quit"))) 
				{
					break;
				}
				// �ظ��ͻ���
				System .out .print("�����>>");
				String str4 = keyboard.nextLine();
				out.println(str4);
				
				//��ʾ��������
				System.out.println();
				System.out .println("--------ʱ��>>"+new Date()+"---------------");
				System.out.println();
			}
		} finally {
			
			System.out.println("�Ự����.");
			socket.close();
			s.close();
		}
	}
}