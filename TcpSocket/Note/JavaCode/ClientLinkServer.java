import java.io.IOException;
import java.net.Socket;

public class ClientLinkServer {
	//private static String Ip;
	//private  int port=3333;
	private Socket socket;
	
	public ClientLinkServer(String Ip,int port)
	{
		try
		{
			socket=new Socket(Ip, port);    //ʹ������ip��˿���������˻������
			new ClientThreadsDeal(socket);             //�������̻߳��ƴ���
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
