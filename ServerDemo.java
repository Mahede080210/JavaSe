import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.IIOException;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * ��������ʵ�ַ��������̲߳���
 * 
 * @author DELL 2017-12-11
 */
public class ServerDemo {
	private static final int portNo = 3333;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket clientSocket;
		ServerSocket serverSocket = null;
		try {
			for (;;)                 //�����ȴ��ͻ��˵�����
			{
				serverSocket = new ServerSocket(portNo);
				clientSocket = serverSocket.accept();               //������ֱ���пͻ�����                     
				new ThreadServerCode(clientSocket);            //һ���пͻ����ӣ����������߳�
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			serverSocket.close();                 //�رշ�����
		}
	}
}
