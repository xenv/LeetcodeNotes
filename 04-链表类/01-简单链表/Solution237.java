/* 
    问题链接：https://leetcode.com/problems/delete-node-in-a-linked-list/
    难度系数 1
    时间复杂度 O(1) 空间 O(1)
    看不懂这题的意义在哪里
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution237 {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return ;
        }
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}