package listOperate;


import dataStructure.ListNode;
/**
 * ��ת����
 * @author Administrator
 *
 */
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode ReverseListMethod(ListNode node) {
		ListNode head = new ListNode();// ָ����ת���ͷ���
		ListNode old = new ListNode();// ָ����ת��Ϊ��ת�������ͷ���
		ListNode tem = new ListNode();// ָ��old����һ����㣬��ֹ������ʧ

		head = node;
		old = node.next;
		while (old!= null) {
			tem = old.next;
			old.next = head;
			head = old;
			old = tem;
		}
		node=head;
		return node;
	}
	//���б��ÿK�����������Ҫ����һ��������K
		public static ListNode ReverseList_K(ListNode node,int K){
			ListNode head = new ListNode();// ָ����ת���ͷ���
			ListNode old = new ListNode();// ָ����ת��Ϊ��ת�������ͷ���
			ListNode tem = new ListNode();// ָ��old����һ����㣬��ֹ������ʧ
			ListNode first=new ListNode();
			
			int count=1;
			first.next=node;//������Ҫfirstָ���סÿK������ͷ��㣬����ָ��ڶ������������ͷ���
			head = node;
			old = node.next;
			while (count<K) {
				tem = old.next;
				old.next = head;
				head = old;
				old = tem;
				count++;
			}
			node=head;
			return node;
		}
}
