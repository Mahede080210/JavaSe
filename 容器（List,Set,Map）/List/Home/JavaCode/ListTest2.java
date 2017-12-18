import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ����ʵ����LinkedList����ջ��ջ���Ƚ������ջ�����в����ɾ����
 * @author DELL
 *2017-12-18
 */
public class ListTest2 {
	
	private LinkedList list=new LinkedList<>();
	
	//�Ƿ�Ϊ��
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	//ʵ�ֲ�ѯջ��Ԫ��
	public Object top()
	{
		return list.getFirst();
	}
	
	
	//ʵ��ջ�Ĳ��뷽��
	public void push(Object element)
	{
		list.addFirst(element);
	}
	
	//��ջ��pop
	public void pop()
	{
		list.removeFirst();
	}
	
	public String  toString()
	{
		return list.toString();
	}


	public static void main(String[] args) {
		
		Person[] stu =new Person[]{new Person("De", 20),new Person("jim", 19),new Person("qane", 21)};
		
		ListTest2 mockStack=new ListTest2();
		for(int n=0;n<stu.length;n++)
		{
			mockStack.push(stu[n]);
		}
		System.out.println("��ǰ��Ա>>"+mockStack);
		
		//��ѯջ��Ԫ��
		System.out.println("ջ��Ԫ��>>"+mockStack.top().toString());
		//ɾ��ջ��Ԫ��
		mockStack.pop();
		System.out.println("��ǰ��Ա>>"+mockStack.toString());
		
		mockStack.push("a");
		mockStack.push("ab");
		mockStack.push("abc");
		System.out.println("��ǰ��Ա>>"+mockStack.toString());
	}

}
