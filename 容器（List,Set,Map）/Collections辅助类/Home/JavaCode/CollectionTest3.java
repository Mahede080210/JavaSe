import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionTest3
{
	public static void main(String[] args){
		
		//�������϶���list,Ҳ��������
		Collection list=new ArrayList();

		//ʵ��������
		Person m1=new Person("����",20);
		Person m2=new Person("����",21);
		Person m3=new Person("����",22);

		//���������Ԫ��
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		//System.out.println(m1.getClass());
		//System.out.println(m1.hashCode());

		//��ȡԪ��
		for(Iterator it=list.iterator();it.hasNext();)
		{
			//System.out.println(it.next());                                      //��ȡ�����hashCode
			//System.out.println(((Person)it.next()).toString());     //��Objectǿ��ת��ΪPerson��Ȼ��ȡ����
			
			//next()�������õĺ����next()�ɶ�д
			System.out.println(((Person)it.next()).getName()+"------"+((Person)it.next()).getAge());
		}
	}

}