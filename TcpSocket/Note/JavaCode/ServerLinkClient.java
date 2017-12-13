import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javax.imageio.IIOException;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * ��������ʵ�ַ��������̲߳������ȴ��ͻ��˵����ӣ�һ���ӵ����ӣ����������̴߳���
 * 
 * @author DELL 2017-12-11
 */
public class ServerLinkClient {
	private static final int portNo = 3333;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket clientSocket;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(portNo);          //����������
			
			//��ʾ��ʼʱ��
			System.out.println();
			System.out .println("--------ʱ��>>"+new Date()+"---------------");
			System.out.println();
			
			System.out.println("����ʼ��������\n���ڵȴ��˿͵ĵ���������");
			
			while(true)                 //�����ȴ��ͻ��˵�����
			{
				clientSocket = serverSocket.accept();               //������ֱ���пͻ�����                     
				new ServerThreadsDeal(clientSocket);            //һ���пͻ����ӣ����������߳�
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			serverSocket.close();                 //�رշ�����
		}
	}
}
