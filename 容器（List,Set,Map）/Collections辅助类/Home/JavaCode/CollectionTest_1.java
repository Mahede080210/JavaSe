import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.sound.sampled.LineListener;
/*
 * ���Ͽ�� ��ϰ1���Ե���Ԫ�صĲ�����add(),contains();remove(),size(),isEmpty(),clear()�Լ��������Ԫ�ء�
 */

public class CollectionTest_1 {

	public static void main(String[] args) {
		
Collection list=new ArrayList();  //�������϶���Ҳ����һ������
		
		//��Ӷ���
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		//��ѯ����Ԫ�ظ���
		int size=list.size();
		System.out.println("list���ϳ���>>"+size);
		//ɾ���������
		boolean isRemoved=list.remove("abc1");
		if(isRemoved)
		{
			System.out .println("ɾ��"+"abc1"+"�ɹ�");
		}
		else{
			System.out .println("ɾ��"+"abc1"+"ʧ��");
		}
		
		
		//��ѯ���м���Ԫ��
		System.out .println(list);

		//��ѯĳ��Ԫ���Ƿ��ڼ�����
		System.out .println("abc3�Ƿ��ڼ�����"+list.contains("abc3"));
		System.out .println("abc5�Ƿ��ڼ�����"+list.contains("abc5"));

		//ɾ������Ԫ��
		list.clear();
		System.out .println(list);

		//�Ƿ�Ϊ��
		System.out .println(list.isEmpty());
 
		
		
		//��ѯ���м���Ԫ��
		System.out .println(list);
	}

}
