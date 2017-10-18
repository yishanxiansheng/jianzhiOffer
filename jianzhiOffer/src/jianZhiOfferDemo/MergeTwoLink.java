package jianZhiOfferDemo;

import dataStructure.*;
/**
 * 两个链表合并，非递归方法
 * @author Administrator
 *
 */
public class MergeTwoLink {

	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		node1.next=new ListNode(3);
		node1.next.next=new ListNode(5);
		node1.next.next.next=new ListNode(7);
		
		ListNode node2=new ListNode(2);
		node2.next=new ListNode(4);
		node2.next.next=new ListNode(6);
		node2.next.next.next=new ListNode(8);
		node2.next.next.next=new ListNode(9);
		node2.next.next.next=new ListNode(10);
		
		ListNode merged=merger(node1, node2);
		while(merged!=null){
			System.out.println(merged.val);
			merged=merged.next;
		}
	}
	public static ListNode merger(ListNode node1,ListNode node2) {
		ListNode start=new ListNode();
		ListNode p=new ListNode();
		start=p;
		if(node1==null&&node2==null){
			return null;
		}
		while(node1!=null&&node2!=null){
			ListNode temp=new ListNode();
			if(node1.val>node2.val){
				temp.val=node2.val;
				node2=node2.next;
			}else{
				temp.val=node1.val;
				node1=node1.next;
			}
			p.next=temp;
			p=p.next;
		}
		if(node1!=null){
			p.next=node1;
		}
		if(node2!=null){
			p.next=node2;
		}
		return start.next;
	}

}
