/* 
    问题链接：https://leetcode.com/problems/odd-even-linked-list/
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

class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        odd.next = head;
        ListNode tail = even;
        ListNode scanner = odd;
        int count = 1;
        while (scanner.next != null) {
            if (count % 2 == 0) {
                tail.next = scanner.next;
                scanner.next = scanner.next.next;
                tail = tail.next;
                tail.next = null;
            } else {
                scanner = scanner.next;
            }
            count++;
        }
        scanner.next = even.next;
        return odd.next;
    }
}