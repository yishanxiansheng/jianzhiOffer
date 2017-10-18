package listOperate;


import dataStructure.ListNode;
/**
 * 翻转链表
 * @author Administrator
 *
 */
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode ReverseListMethod(ListNode node) {
		ListNode head = new ListNode();// 指向逆转后的头结点
		ListNode old = new ListNode();// 指向逆转后为逆转的链表的头结点
		ListNode tem = new ListNode();// 指向old的下一个结点，防止老链表丢失

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
	//将列表的每K项进行逆序，需要增加一个计数器K
		public static ListNode ReverseList_K(ListNode node,int K){
			ListNode head = new ListNode();// 指向逆转后的头结点
			ListNode old = new ListNode();// 指向逆转后为逆转的链表的头结点
			ListNode tem = new ListNode();// 指向old的下一个结点，防止老链表丢失
			ListNode first=new ListNode();
			
			int count=1;
			first.next=node;//这里需要first指针记住每K个结点的头结点，让它指向第二个逆序链表的头结点
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
