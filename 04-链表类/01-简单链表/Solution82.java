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
        ListNode scanner = dummyHead;
        Integer temp = null;
        while (scanner.next != null) {
            if ((scanner.next.next != null && scanner.next.val == scanner.next.next.val) 
                || Objects.equals((Integer)scanner.next.val, temp)) {
                temp = scanner.next.val;
                scanner.next = scanner.next.next;
            } else {
                scanner = scanner.next;
            }
        }
        return dummyHead.next;
    }
}