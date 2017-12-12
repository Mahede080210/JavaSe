import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class OneThreadClientCode {
	static String clientName = "Mike";
	// �˿ں�
	public static int portNo = 3333;

	public static void main(String[] args) throws IOException {
		Scanner keyboard=new Scanner(System.in);
		
		// �������ӵ�ַ��,���ӱ���
		InetAddress addr = InetAddress.getByName("localhost");
		
		// Ҫ��Ӧ�������˵�3333�˿ں�
		Socket socket = new Socket(addr, portNo);
		try {
			//��ʾʱ��
			System.out.println();
			System.out .println("--------ʱ��>>"+new Date()+"---------------");
			System.out.println();
			
			System .out .println("�����ǿͻ��ˣ�");

			// ����IO���
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),
					true);
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
				
				//��ʾʱ��
				System.out.println();
				System.out .println("--------ʱ��>>"+new Date()+"---------------");
				System.out.println();
			}
		} finally {
			System.out.println("-------------------------");
			System.out.println("�Ự����.");
			socket.close();
		}
	}
}