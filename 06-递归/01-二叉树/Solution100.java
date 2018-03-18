/* 
    问题链接：https://leetcode.com/problems/same-tree
    难度系数 4
    时间复杂度 O(n) 空间 O(h)
   
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 底层1
        if (p == null && q == null ) {
            return true;
        }
        // 底层 2
        if (p == null || q == null ) {
            return false;
        }
        
        // 中层
        // 下
        Boolean left = isSameTree(p.left, q.left);
        Boolean right = isSameTree(p.right, q.right);
        // 回
        return p.val == q.val && left && right;
    }
}