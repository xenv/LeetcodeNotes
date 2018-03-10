/* 
    问题链接：https://leetcode.com/problems/remove-linked-list-elements/
    难度系数 4
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

class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        //虚拟头节点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode scanner = dummyHead;
        while ( scanner.next != null ){
            if ( scanner.next.val == val) {
                scanner.next = scanner.next.next;
            } else {
                scanner = scanner.next;
            }
        }
        return dummyHead.next;
    }
}