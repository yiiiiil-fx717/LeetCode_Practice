package Leetcode;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Leetcode_021 {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode preHead = new ListNode(-1);
        
        ListNode prev = preHead;
        
        while(l1 != null && l2 != null){    //when one list null, then break out the while loop
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        
        prev.next = l1 == null? l2 : l1;    //check which list goes null, then append elements from the other list
        
        return preHead.next;
    }
}
