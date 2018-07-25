package Leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Leetcode_725 {
	public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        ListNode current = root;
        int totalElement = 0;
        while(current != null){
            current = current.next;
            totalElement++;
        }
        if(root == null || totalElement == 0){
            return result;
        }
        
        int elementNumberPerPart = totalElement / k;
        int numberOfExtraElement = totalElement % k;
        
        current = root;
        for(int i = 0; i < result.length; i++){
            
            ListNode head = new ListNode(0);
            ListNode node = head;
            
            for(int j = 0; j < elementNumberPerPart + (i < numberOfExtraElement ? 1 : 0); j++){
            	node.next = new ListNode(current.val);
                node = node.next;
                if(current != null){
                    current = current.next;
                }
            }
            result[i] = head.next;
        }
        return result;
    }
}
