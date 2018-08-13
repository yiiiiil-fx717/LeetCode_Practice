package Leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}

public class Leetcode_148 {
	
	public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        //divide the list into two
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //first and second half of the list
        fast = slow.next;
        slow.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(fast);
        
        return mergeList(left, right);
    }
    
    private static ListNode mergeList(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;
        if(left.val < right.val){
            left.next = mergeList(left.next, right);
            return left;
        }else{
            right.next = mergeList(left, right.next);
            return right;
        }
    }
    
    public static void display(ListNode head) {
		ListNode currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.val);
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(1);
		ListNode temp = sortList(head);
		display(temp);
	}
}
