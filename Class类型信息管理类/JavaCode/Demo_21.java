/*��Ƚ���Class��
 1.̸̸forName()��getClass(),��  .class
 >>(1)forName()����Class�ľ�̬������`class Class{ ... static Class forName(String str){ .... retuen.... } ... }`������
 ʹ��Class.forName(..)
 >>(2)getClass()����Object�࣬�����า�ǣ�����Class���ã�����������`String obj=new String ;obj.getClass()`
 ����һ��Class���ã��ö����װ���������������Ϣ������str������������
 >>(3) .class �����泣�����Է���Class�����ã�����`Class c=String.class`
 >>>���������Զ��׼���forName����Class���ã�getClass������������װ����á������߲�ͬ
 ��forName��.class���������ڡ�����������������
 2.forName(...)��.class�������
 >>(1)forName��.class�ĵ����߲�ͬ
 >>(2)forName("String")��ʹ��Class�����װString������Ϣʱ���ᴴ��Class��������ã����أ������ӣ�
 ��ʼ����˵�������ӣ���ʵ�����ڷ���洢�ռ䣩����ʼ����String��ľ�̬��Ա��������
 �Ĵ洢�ռ��ʼ����
 >>(3)����Class c=String.classʱ�ᴴ��Class��������ã��������ʼ���ö���,ֱ��ʹ�õ���ľ�̬��Աʱ
 �Żᱻ��ʼ�����߼�������ࡣ��ľ�̬��Ա��static��䣬��������������ʽ��̬������
 
 >>>>�����ĸ�demoֵ���о���Demo21,Demo22,Demo23,Demo2��
 static final��Ա�����������ͷ������������ڱ������ڳ������ʱ�ͱ����أ�����ʱֱ�ӻ�ȡ����
 ����static��䣺��̬��Ա����ֻ�������౻���س�ʼ������ܱ���ȡ����ĳ�ʼ�����ǽ���̬��Ա
 							���ص���̬������Щ��Աʼ�������࣬��������Ķ���
 final��䣺����ȥ
 
 */
public class Demo_21 {
	static final int staticFinal1=1;         //�����ڳ������ڳ�ʼ��ǰ�ͱ�����
	static final int staticFinal2=Demo_2.rand.nextInt(1000);   //
	static {                                        //���͵ľ�̬��Ա����ʼ��ʱ�ͻᱻ����
		System.out.println("------------------------");
		System.out.println("Demo21��ʼ��");
	}
}
