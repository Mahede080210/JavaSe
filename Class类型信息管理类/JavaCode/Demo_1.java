
public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Class class1=str.getClass();
		System.out.println("String�����Ϣ>>>");
		System.out.println("--------ȫ����>>>"+class1.getName());
		System.out.println("--------��һ����>>>"+class1.getSimpleName());
		System.out.println("--------ȫ��>>>"+class1.getCanonicalName());
		System.out.println("--------����>>>"+class1.getSuperclass().getName());
		System.out.println("--------�ӿڣ�"+class1.isInterface());

		System.out.println("Class����������Ϣ>>>");
		Class class2=class1.getClass();
		System.out.println("--------ȫ����>>>"+class2.getName());
		System.out.println("--------��һ����>>>"+class2.getSimpleName());
		System.out.println("--------ȫ��>>>"+class2.getCanonicalName());
		System.out.println("--------����>>>"+class2.getSuperclass().getName());
		System.out.println("--------�ӿڣ�"+class2.isInterface());;
	}

}
