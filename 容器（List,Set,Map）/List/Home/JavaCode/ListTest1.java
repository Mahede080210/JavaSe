
import java.util.List;
import java.util.ArrayList;

public class ListTest1 {
	public static void main(String[] args) {

		// ����List���϶��󣬼�list����
		List list = new ArrayList();

		// ��Ӷ���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

		System.out.println("ԭ����>>" + list);

		// ���ݽǱ꣬��ָ��λ�����Ԫ�أ��Ǳ겻�ܳ���size��С
		list.add(1, "abc4");
		System.out.println("��Ӻ�>>" + list);

		// list.add(5,"abc5"); //����Խ��

		// ���ݽǱ��Ƴ�Ԫ��
		// list.remove(1); //remove(int index)�����������ֵΪɾ����Ԫ��ֵ
		System.out.println("ɾ��" + list.remove(1) + "�ɹ�");
		System.out.println("ԭ���ϱ�Ϊ>>" + list);

		// ���ݽǱ��޸�Ԫ��ֵ
		// set()��������һ�����޸ĵ�Ԫ��ֵ
		// list.set(0,"abc0");
		System.out.println("set(0,abc0)>>" + list.set(0, "abc0"));

		// ����Ԫ�أ����ݽǱ����Ԫ��
		System.out.println("list.get(1)>>"+list.get(1));
		
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
