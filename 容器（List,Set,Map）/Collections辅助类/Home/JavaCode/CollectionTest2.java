import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class CollectionTest2 {
	/*
	 * ���Ͽ����ϰ2��ʵ�ֶ�һ��Ԫ�ش���ķ�����addALL();containsAll();remainAll();removeAll();
	 */
	public static void main(String[] args) {

		// �������϶���list2��Ҳ��������
		Collection list1 = new ArrayList<>();
		// ���Ԫ��
		list1.add("abc1");
		list1.add("abc2");

		// �������϶���list2��Ҳ��������
		Collection list2 = new ArrayList<>();
		// ���Ԫ��
		list2.add("abc3");
		list2.add("abc4");

		// �������϶���list3��Ҳ��������
		Collection list3 = new ArrayList<>();
		// ���Ԫ��
		list3.add("abc5");
		list3.add("abc6");

		// ��list1���һ��Ԫ��
		boolean result1 = list1.addAll(list2);
		System.out.println("�Ƿ���ӳɹ�>>" + result1);
		System.out.println(list1);

		// list1���Ƿ���list3��Ԫ��
		boolean result2 = list1.containsAll(list3);
		System.out.println("list1�Ƿ���list3>>" + result2);

		// ɾ��һ��Ԫ��
		boolean result3 = list1.removeAll(list3);
		System.out.println("�Ƿ�ɾ���ɹ�>>" + result3);

		// ����Ԫ�صĽ����ж�,
		// list1�仯��
		// ����н�����list1��ֻ�洢����Ԫ�أ�ɾ������δ����Ԫ��
		// ���û�У�list1Ϊ�ռ��ϡ�
		// ����ֵ��
		// list1�б仯����true���ޱ仯����false��

		// �ܽ᣺��������Ԫ��һ����list1���䣬��������false��
		// ��������Ԫ�ز�һ����list1ҪôΪ�գ�ҪôΪ�������֣�����true
		boolean result4 = list1.retainAll(list2);
		System.out.println("û�н�����>>" + result4);
		System.out.println(list1);

		// ��Iteratorʵ��ȡ������Ԫ��
		for (Iterator it = list1.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}

	}

}
