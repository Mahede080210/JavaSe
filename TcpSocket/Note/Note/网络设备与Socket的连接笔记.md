# ������
> ���Ǳ����ڳ�ѧ������ʱһ��ʼǡ�
>����Ϊ�����̰����ĸ�ģ�飺
>1.�ͻ����������豸������
>2.�����豸��Socket�������Լ������豸��״̬���
>3.
>

һ.


## ��.�����豸��Socket�������Լ������豸��״̬���
>���������δ���˵������
>�˶δ���ʵ����·�豸��Ϣ�ķ�װ
```java
package NetDevice_Socket_ServerSocket;
/**
 * ����ʵ����·�豸��Ϣ�ķ�װ
 */
import javax.swing.table.TableStringConverter;

public class NetDevice {
	
	
	private String ip;                      //�����豸��ip��ַ
	private int port;                        //�����豸�����Ӷ˿�
	private String manufacture;     //�����豸�ĳ���
	private String location;              //�����豸�İ��õص�
	private String model;                //�����豸�����ͣ����������Ǽ���������·����
	
	
	public NetDevice(String ip,int port ,String manufacture,String location,String model)
	{
		setIp(ip);
		setPort(port);
		setManufacture(manufacture);
		setLocation(location);
		setModel(model);
	}
	public NetDevice(String ip,int port)
	{
		setIp(ip);
		setPort(port);
	}
	
	//ip
	public String getIp()
	{
		return ip;
	}
	public void  setIp(String newIp)
	{
		ip=newIp;
	}
	
	//manufacture
	public String getManufacture()
	{
		return manufacture;
	}
	public void  setManufacture(String newManufacture)
	{
		manufacture=newManufacture;
	}
	
	//location
	public String getLocation()
	{
		return location;
	}
	public void  setLocation(String newLocation)
	{
		location=newLocation;
	}
	
	//Model
	public String getModel()
	{
		return model;
	}
	public void  setModel(String newModel)
	{
		model=newModel;
	}
	
	//port
	public int getPort()
	{
		return port;
	}
	public void  setPort(int newPort)
	{
		port=newPort;
	}
	
	public String toString()
	{
		return"�����豸��Ϣ��"
	+"\nIP>>"+this.getIp()
	+"\n�˿�>>"+this.getPort()
	+"\n����>>"+this.getManufacture()
	+"\n��ַ>>"+this.getLocation()
	+"\n�豸����>>"+this.getModel();
	}
	
	

}
```
>�˶δ��������ڼ�������豸��Socket�׽����Ƿ����ӳɹ�
```java
package NetDevice_Socket_ServerSocket;
/**
 * �������ڼ�������豸��Socket�׽����Ƿ����ӳɹ���
 * @author DELL
 *2017-12-7
 */

import java.io.IOException;
import java.net.Socket;
import org.omg.CORBA.IntHolder;

public class NetDeviceMonitor {
	private NetDevice netDevice;
	private Socket socket;
	private int limitTime;
	
	public boolean monitor(NetDevice netDevice,Socket socket,int limitTime)
	{
		try
		{
			if(netDevice.getIp()!=null&&netDevice.getPort()!=0)
			{
				for(int n=1;n<=limitTime;n++)
				{
					socket=new Socket(netDevice.getIp(),netDevice.getPort());
				}
			}
		}
		catch(IOException e)
		{
			System.out .println("���������豸ʧ��");
			System.out .println(netDevice.toString());
			e.printStackTrace();
			return false;
		}
		finally
		{
			try
			{
				socket.close();   //�׳��쳣˵���޷������������
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
				System.out .println("���������豸ʧ��");
				System.out .println(netDevice.toString());
				return false;
			}
		}
		System.out.println("�ɹ������豸");
		return true;
	}
		
}
```
### ע�⣺��δ��룺
```java
try
			{
				socket.close();   //�׳��쳣˵���޷������������
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
				System.out .println("���������豸ʧ��");
				System.out .println(netDevice.toString());
				return false;
			}
```
˵��Ϊ��close()�����쳣˵���޷������������
```
Ӧ�ò������Ҫ�ر�һ��TCP���ӿ���ֱ�ӵ���closesocket()�����������������Ϊ��������������ֻ����
��closesocket()����Ĺ��£����ܶԹر�TCP��������ȷ����ʶ��
������ȷһ�㣺�κ�����£�����closesocket֮��socket�������ʧЧ(һ��������⣬������)���ٶ�
��socket���в�����API����ʧ�ܡ�����socket�����Ӧ��ϵͳ��Դ��һ�������ͷţ����ں˿��ơ�
�ٶ�A�˵���closesocket()�����������رա������Ǽ��������
1��Ĭ�ϵ���Ϊ�������ܵĳ������4�����֣������FIN��ACK������ʱ��A�˷��ͻ����������ݻᷢ�͵�B��
�����ȴ�B�˵�ȷ�ϣ�B�˷���FIN��A�˽���TIME_WAIT״̬��
2��l_onoffֵΪ0���൱��Ĭ����Ϊ��
3��l_onoffֵ��0��l_lingerΪ0��A�˵���closesocket()������RST��λ���ӣ����з��͡����ջ�����������
����������socket��Դ���ͷţ�A�˲�����TIME_WAIT״̬��B�˵�recv��õ�WSAECONNRESET����
4��l_onoffֵ��0��l_linger��0��socket�������ģ���closesocket()�����������أ����ǵȴ�l_linger����
ʱ�䣬��l_lingerʱ����������ͻ�����������ݷ��Ͳ���B��ȷ�ϣ���closesocket()���أ�֮����Ȼ�ǡ�
���š��Ĺرգ�A�˽���TIME_WAIT״̬��������ͻ�����������û�з�����ϻ���û���յ�B��ȷ�ϣ���
closesocket���أ�ͬʱ�ں˷���û�з��͵����ݻ��ǲ��ٵȴ�B�˵�ȷ�ϣ�ֱ�ӷ���RST��λ���ӣ�A�˲���
��TIME_WAIT״̬��
5��l_onoffֵ��0��l_linger��0��socket�Ƿ������ģ�����closesocket()�������أ�����ӵ��õ����ص�ʱ���ڣ�������ɷ��ͻ��������ݵķ��ͺͶԶ˵�ȷ�ϣ���closesocket����WSAEWOULDBLOCK��Ҫע����ǣ�����WSAEWOULDBLOCK����ζ��socket���ʧЧ������ζ����γ���closesocket���ɹ���Ӧ�ò���Ҫ�Ժ��������closesocket()�����Թر����ӣ��ǲ��Ǿ��úͷ������µ�connect()��send()��recv()���񣿣�����ֱ��closesocket()������WSAEWOULDBLOCK��
 
�����ϸ������Ҳ���Կ�����Ӧ�ò�򵥵�closesocket()���ܱ�֤�Զ˵�Ӧ�ò���ȷ���յ����ݣ��Զ˵Ľ��ջ������յ�������Ӧ�ò��յ�����
```
��.

��.