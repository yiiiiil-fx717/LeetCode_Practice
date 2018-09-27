package Leetcode;

public class Leetcode_019 {
	
	class ListNode{
		int val;
		ListNode next;
		
		ListNode(int x){
			val = x;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pointer = head;
		
		int length = 0;
		while(pointer != null){
			length++;
			pointer = pointer.next;
		}
		
		int diff = length - n;
		
		pointer = dummy;
		while(diff > 0){
			diff--;
			pointer = pointer.next;
		}
		pointer.next = pointer.next.next;
		
		return dummy.next;
	}
}
