package Leetcode;

public class Leetcode_082 {
	public ListNode deleteDuplicates(ListNode head) {
		 if(head == null || head.next == null) return head; 
		 ListNode dummy = new ListNode(-1);
		 
		 ListNode result = dummy;
		 ListNode prev = head;
		 ListNode current = head;
       
		 while(current != null && current.next != null){
            
			 while(current.next != null && current.next.val == prev.val){
				 current = current.next;
            }
            
			 if(current == prev){
				 result.next = prev;
				 result = result.next;
			 }
            
			 prev = current.next;
			 current = current.next;
		 }
       
		 result.next = current;
		 return dummy.next; 
	 }
}
