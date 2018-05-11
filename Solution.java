package Leetcode;

public class Solution {
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        if(headA == null || headB == null){
            return null;
        }
        
        int lengthA = 0;
        int lengthB = 0;
        
        while(tempA != null){
            tempA = tempA.next;
            lengthA++;
        }
        while(tempB != null){
            tempB = tempB.next;
            lengthB++;
        }
    
        while(lengthA < lengthB){
            headB = headB.next;
            lengthB--;
        }
        while(lengthA > lengthB){
            headA = headA.next;
            lengthA--;
        }
        
        do{
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }while(headA != null && headB != null && headA != headB);
        
        return headA;
    }
    
    public static void main(String args[]){
    	//[1,3,5,6,7,8,9,10]
    	//[2,4,6,7,8,9,10]
    	ListNode intersection = new ListNode(6);
    	intersection.next = new ListNode(7);
    	
    	ListNode headA = new ListNode(1);
    	headA.next = new ListNode(3);
    	headA.next.next = new ListNode(5);
    	headA.next.next.next = intersection;
    	
    	ListNode headB = new ListNode(2);
    	headB.next = new ListNode(4);
    	headB.next.next = intersection;
    	
    	System.out.println(getIntersectionNode(headA,headB).val);
    }
}