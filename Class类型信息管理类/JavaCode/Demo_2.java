import java.util.Random;

public class Demo_2 {

	static Random rand = new Random(47);
	static {
		System.out.println("------------------------");
		System.out.println("Demo2����ʼ��");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class class1 = Demo_21.class; // ��ȡDemo21��������Ϣ�������ʼ��Class1,�������Ҳ�������Demo21
		System.out.println("��ʼ����");
		System.out.println(Demo_21.staticFinal1);//ֱ�ӻ�ȡ�����ڱ�����ͬʱҲ�������Demo21
		System.out.println(Demo_21.staticFinal2);
		System.out.println(Demo_22.staticNoFinal);//�ȼ��غ��ʼ�����ٻ�ȡ�����
		System.out.println("-------------");
		try {
			Class class2 = Class.forName("Demo_23"); //����class2����ʼ����Demo23Ҳ�����غͳ�ʼ��
		} catch (ClassNotFoundException e) {
		}
		finally{
			System.out.println("��������");
		}
	}

}
