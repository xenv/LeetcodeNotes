/* 
    问题链接：https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    难度系数 2
    时间复杂度 O(n) 空间 O(1)
   
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode scannerSlow = dummyHead;
        ListNode scannerFast = dummyHead;
        for (int i = 0; i < n + 1; i++) {
            scannerFast = scannerFast.next;    
        }
        while(scannerFast != null) {
            scannerSlow = scannerSlow.next;
            scannerFast = scannerFast.next;    
        }
        scannerSlow.next = scannerSlow.next.next;
        return dummyHead.next;
    }
}