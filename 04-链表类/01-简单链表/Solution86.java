/* 
    问题链接：https://leetcode.com/problems/partition-list/
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
class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        small.next = head;
        ListNode scanner = small;
        ListNode tail = large;
        while ( scanner.next != null ) {
            if (scanner.next.val >= x) {
                tail.next = scanner.next;
                scanner.next = scanner.next.next;
                tail = tail.next;
                tail.next = null;
            } else {
                scanner = scanner.next;
            }
        }
        scanner.next = large.next;
        return small.next;
    }
}