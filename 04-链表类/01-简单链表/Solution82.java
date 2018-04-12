/* 
    问题链接：https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
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
class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode scanner = head;
        ListNode pre = dummyHead;
        while(scanner != null) {
            while (scanner.next != null && scanner.val == scanner.next.val) {
                scanner = scanner.next;
            }
            if (scanner == pre.next) {
                pre = pre.next;
            } else {
                pre.next = scanner.next;
            }
            scanner = scanner.next;
        }
        return dummyHead.next;
    }
}