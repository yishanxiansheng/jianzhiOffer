package jianZhiOfferDemo;
import java.util.Stack;
import dataStructure.*;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * ��ָoffer�����
 * 
 * @author HeShufan
 *
 */
public class JianZhiOffer {

	public static void main(String[] args) {
		ListNode listNode1=new ListNode(1);
		listNode1.next=new ListNode(2);
		
		ListNode listNode2=new ListNode(1);
		listNode2.next=new ListNode(2);

		ListNode resullt = twoNodeAdd(listNode1, listNode2);

		while(resullt!=null){

			System.out.println(resullt.val);
			resullt=resullt.next;
		}
	}

	/**
	 * ��ά�������
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int[][] array) {
		int c = array.length;
		int r = array[0].length;
		boolean isHas = false;
		if (c > 0 && r > 0) {
			int cc = 0;
			int rr = r - 1;
			while (cc < c && rr > -1) {
				if (array[cc][rr] == target) {
					isHas = true;
					break;
				} else if (array[cc][rr] < target) {
					cc++;
				} else {
					rr--;
				}
			}
		}
		return isHas;
	}

	/**
	 * ��β��ǰ��������
	 * 
	 * @param listNode
	 * @return
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> arraylist = new ArrayList<>();

		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		if (stack.empty() == false) {
			while (!stack.empty()) {
				arraylist.add(stack.pop());
			}
		}

		return arraylist;
	}

	/**
	 * ǰ���������������
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0 || in.length == 0) {
			return null;
		}
		return constuctTree(pre, 0, pre.length, in, 0, in.length);
	}

	public TreeNode constuctTree(int[] pre, int startPreNum, int endPreNum, int[] in, int startInNum, int endInNum) {
		TreeNode rootNode = new TreeNode(pre[startPreNum]);
		rootNode.childLeft = rootNode.childRight = null;

		if (startPreNum == endPreNum) {
			if (startInNum == endInNum) {
				return rootNode;
			}
		}

		int rootIn = startInNum;
		while (rootIn < endInNum && in[rootIn] != pre[startPreNum]) {
			rootIn++;
		}
		return rootNode;

	}

	/**
	 * ��������k�����;
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode FindKthToTail(ListNode head, int k) {
		ListNode preNode = head;
		ListNode node = null;
		if (preNode == null || k == 0) {
			return null;
		}
		for (int i = 0; i < k - 1; i++) {
			if (preNode.next != null) {
				preNode = preNode.next;
			} else {
				return null;
			}

		}
		node = head;
		while (preNode.next != null) {
			node = node.next;
			preNode = preNode.next;
		}
		return node;
	}

	/**
	 * ����ת
	 * 
	 * @param head
	 * @return
	 */
	public ListNode ReverseList(ListNode head) {
		ListNode prenode = null;
		ListNode node = head;
		ListNode reHead = null;
		while (node != null) {
			ListNode next = node.next;
			if (next == null) {
				reHead = node;

			}
			node.next = prenode;
			prenode = node;
			node = next;
		}
		return reHead;

	}

	/**
	 * �ϲ�����list
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode Merge(ListNode list1, ListNode list2) {

		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}
		ListNode result = null;
		if (list1.val > list2.val) {
			result = list2;
			result.next = Merge(list1, list2.next);
		} else {
			result = list1;
			result.next = Merge(list1.next, list2);
		}
		return result;
	}

	/**
	 * �ж���b�Ƿ�Ϊa������
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			// ��һ�����ҵ����ڵ���ͬ�ĵ�
			if (root1.val == root2.val) {
				result = isSame(root1, root2);
			}
			// ����ȼ�������a���ҵ���ȵ����ж�
			if (!result) {
				result = HasSubtree(root1.childLeft, root2);
			}
			if (!result) {
				result = HasSubtree(root1.childRight, root2);
			}
		}

		return result;
	}

	public boolean isSame(TreeNode node1, TreeNode node2) {
		if (node2 == null) {
			return true;
		}
		if (node1 == null) {
			return false;
		}
		if (node1.val != node2.val) {
			return false;
		}
		return isSame(node1.childLeft, node2.childLeft) && isSame(node1.childRight, node2.childRight);
	}

	/**
	 * ���ľ���
	 * 
	 * @param root
	 */
	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.childLeft == null && root.childRight == null) {
			return;
		}
		TreeNode temp = root.childLeft;
		root.childLeft = root.childRight;
		root.childRight = temp;
		if (root.childRight != null) {
			Mirror(root.childLeft);
		}
		if (root.childRight != null) {
			Mirror(root.childRight);
		}
	}

	/**
	 * ѭ����ӡ����
	 * 
	 * @param matrix
	 * @return
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		if (matrix == null) {
			return null;
		}
		int c = matrix.length;
		int r = matrix[0].length;
		int start = 0;
		while (c > start * 2 && r > start * 2) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp = printCircle(matrix, start, c, r);
			for (int i = 0; i < temp.size(); i++) {
				list.add(temp.get(i));
			}
			start++;
		}
		return list;
	}

	public ArrayList<Integer> printCircle(int[][] matrix, int start, int c, int r) {
		ArrayList<Integer> temp = new ArrayList<>();
		int endX = r - 1 - start;
		int endY = c - 1 - start;
		// ��һ�� ǰ�����У���������
		for (int i = start; i <= endX; i++) {
			temp.add(matrix[start][i]);
		}
		// �ڶ���
		for (int i = start + 1; i <= endY && start < endY; i++) {
			temp.add(matrix[i][endX]);

		}
		for (int i = endX - 1; i >= start && start < endX && start < endY; i--) {
			temp.add(matrix[endY][i]);

		}
		for (int i = endY - 1; i > start && endY - start >= 2 && start < endX; i--) {
			temp.add(matrix[i][start]);

		}
		return temp;

	}

	/**
	 * �жϵ�������
	 * 
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length != popA.length || pushA.length == 0 || popA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while (!stack.empty() && stack.peek() == popA[j]) {
				stack.pop();
				j++;

			}

		}
		if (j == popA.length) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * �������
	 * 
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		LinkedList<TreeNode> list = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		if (root == null) {
			return arrayList;
		}
		list.add(root);
		while (!list.isEmpty()) {
			TreeNode node = list.getFirst();
			arrayList.add(node.val);
			if (node.childLeft != null) {
				list.add(node.childLeft);
			}
			if (node.childRight != null) {
				list.add(node.childRight);
			}
			list.removeFirst();
		}
		return arrayList;
	}
	/**
	 * �����������ĺ�������ж�
	 * @param sequence
	 * @return
	 */
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length == 0) {
			return false;
		}
		if (sequence.length == 1) {
			return true;
		}
		return search(sequence, 0, sequence.length - 1);
	}

	public boolean search(int[] seq, int start, int end) {

		// �����������һ���֣�û��������true
		if (start > end) {
			return true;
		}
		int i = end;
		// i�������ǰ����һֱ�ҵ���һ���ȵ�ǰ���ڵ�С���������������ʼ���ַ�����Ϊǰ��������
		while (i > start && seq[i - 1] > seq[end]) {
			i--;
		}
		// ǰ�첿������бȸ��ڵ�����������false
		for (int j = 0; j < i - 1; j++) {
			if (seq[j] > seq[end]) {
				return false;
			}
		}
		// ���������ǰ�벿�ֺͺ�벿��
		return search(seq, start, i - 1) && search(seq, i, end - 1);

	}
	/**
	 * �����������
	 * @param listNode1
	 * @param listNode2
	 * @return
	 */
	public static ListNode twoNodeAdd(ListNode listNode1, ListNode listNode2) {
		ListNode result=new ListNode();
		ListNode head=result;
		if (listNode1 == null && listNode2 == null) {
			return null;
		}
		int yu = 0;
		int y = 0;
		while(listNode1 != null && listNode2 != null){
			int a = listNode1.val + listNode2.val + y;
			yu = a%10;//ȡ��
			System.out.println("yu"+yu);
			y = a/10;//��
			System.out.println("y"+y);
			
			ListNode listNode=new ListNode(yu);
			result.next=listNode;
			result=result.next;
			listNode2=listNode2.next;
			listNode1=listNode1.next;
		}
		while(listNode1!=null){
			result.next=listNode1;
			result=result.next;
			listNode1=listNode1.next;
		}
		while(listNode2!=null){
			result.next=listNode2;
			result=result.next;
			listNode2=listNode2.next;
		}
		
		
		return head.next;
	}
	/**
	 * ���������е�����
	 * @param a
	 * @return
	 */
	public static int  MaxSeriseNumber(int[] a) {
		int max=0;
		
		return max;
	}
	

}
