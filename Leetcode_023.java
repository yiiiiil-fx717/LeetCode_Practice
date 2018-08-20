package Leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode_23 next;
 *     ListNode_23(int x) { val = x; }
 * }
 */

class ListNode_23{
	int val;
	ListNode_23 next;
	ListNode_23(int x){
		val = x;
	}
}

public class Leetcode_023 {
	
	public static ListNode_23 mergeKLists(ListNode_23[] lists) {
        if(lists.length == 0 || lists == null) return null;
        
        return merge(0, lists.length - 1, lists);
    }
	
	private static ListNode_23 merge(int left, int right, ListNode_23[] lists){
		if(left > right) return null;
		if(left == right) return lists[left];
		int mid = (left + right) / 2;
		
		ListNode_23 l = merge(left, mid, lists);
		ListNode_23 r = merge(mid + 1, right, lists);

		ListNode_23 head = new ListNode_23(0);
        ListNode_23 current = head;
        
        while(l != null && r != null){
        	if(l.val > r.val){
        		current.next = r;
        		r = r.next;
        		current = current.next;
        	}else{
        		current.next = l;
        		l = l.next;
        		current = current.next;
        	}
        }
        
        while(l != null){
        	current.next = l;
        	l = l.next;
        	current = current.next;
        }
        
        while(r != null){
        	current.next = r;
        	r = r.next;
        	current = current.next;
        }
        
        return head.next;
	}
	
	public static void display(ListNode_23 head) {
		ListNode_23 currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.val);
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		//Sorted linked Lists
		ListNode_23 list1 = new ListNode_23(1);
		list1.next = new ListNode_23(4);
		list1.next.next = new ListNode_23(5);
		
		ListNode_23 list2 = new ListNode_23(1);
		list2.next = new ListNode_23(3);
		list2.next.next = new ListNode_23(4);
		
		ListNode_23 list3 = new ListNode_23(2);
		list3.next = new ListNode_23(6);
		
		ListNode_23[] lists = {list1, list2, list3};
		ListNode_23 result = mergeKLists(lists);
		display(result);
	}
}
