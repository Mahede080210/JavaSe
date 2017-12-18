# ��������List

## ���
```
|--List:�������� Ԫ��������ģ��洢��˳���ȡ����˳��һ�£�
	�ü��ϵ�Ԫ�ض����������Ǳ꣩�������顣���Դ洢�ظ�Ԫ��
	��Ϊ�нǱ꣬һ���Ǳ��һ��Ԫ�ء�
```

## list������Է������̳�Collection�� ���з���
1. ���Ԫ��

2. ɾ��Ԫ��

3. �޸�Ԫ��

4. ����Ԫ��

#### List���з���

1. add(����1������Ԫ��  )  //��ָ��λ�ò���Ԫ��

## ����ʵ��
```java
import java.util.List;
import java.util.ArrayList;
public class ListTest1{
	public static void main(String[] args){

		//����List���϶��󣬼�list����
		List list=new ArrayList();

		//��Ӷ���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

		System.out.println("ԭ����>>"+list);

		//���ݽǱ꣬��ָ��λ�����Ԫ�أ��Ǳ겻�ܳ���size��С
		list.add(1,"abc4");

		//����Խ��
		//list.add(5,"abc5");     
		System.out.println("��Ӻ�>>"+list);


		//���ݽǱ��Ƴ�Ԫ��
		//list.remove(1);        //remove(int index)�����������ֵΪɾ����Ԫ��ֵ
		System.out.println("ɾ��"+list.remove(1)+"�ɹ�");
		System.out.println("ԭ���ϱ�Ϊ>>"+list);


		//���ݽǱ��޸�Ԫ��ֵ
		//set()��������һ�����޸ĵ�Ԫ��ֵ
		//list.set(0,"abc0");
		System.out.println("set(0,abc0)>>"+list.set(0));

		//����Ԫ�أ����ݽǱ����Ԫ��
		System.out.println("list.get(1)");

	
		//����Ԫ��ֵ�鿴��ֵ���ڽǱ�
		System.out.println("indexOf(abc2)>>"+list.indexOf("abc2"));


		//���ݽǱ��ȡ���б�
		System.out.println("subList(0,2)>>"+list.subList(0,2));	


		//��ȡ����Ԫ��,ʹ��forѭ������
		for(int n=0;n<list.size();n++)
		{
			System.out.println("������Ԫ��>>"+list.get(n));
		}
		
	}
}
```
#### ע�⣺
```
1. add(�Ǳ꣬����Ԫ��);����ĽǱ겻��Խ�����е�size�����������������

list.add(5,"abc5");
���н����
	Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
	at java.util.ArrayList.rangeCheckForAdd(ArrayList.java:661)
	at java.util.ArrayList.add(ArrayList.java:473)
	at ListTest1.main(ListTest1.java:20)

2. remove(int index)�����������ֵΪɾ����Ԫ��ֵ 

System.out.println("ɾ��"+list.remove(1)+"�ɹ�");
���н����
	ɾ��abc4�ɹ�

3. ���ݽǱ��޸�Ԫ��ֵ��set(�Ǳ꣬��ֵ)������ֵΪ���޸ĵ�ֵ��

4. subList(���Ǳ꣬ĩ�Ǳ�)���������б�����Ǳ��Ԫ��ֵ��������ĩ�Ǳ��Ԫ��ֵ

```