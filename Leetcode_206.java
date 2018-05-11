package Leetcode;

public class Leetcode_206 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){ 
			val = x; 
		}
	}
	
	
	public static ListNode reverseList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
    }
	
	public static ListNode reverseList1(ListNode head, ListNode end){
		if(head == null)
			return null;
		if(head == end){
			head.next = null;
			return head;
		}
		ListNode tmp = head;
		while(tmp.next != end){
			tmp = tmp.next;
		}
		end.next = reverseList1(head, tmp);
		return end;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		head = reverseList1(null,null);
		ListNode temp = head;
		while(temp != null){
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

}
