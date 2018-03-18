/* 
    问题链接：https://leetcode.com/problems/symmetric-tree/
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
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // 底层 1
        if (t1 == null && t2 == null ) {
            return true;
        }
        // 底层 2
        if (t1 == null || t2 == null ) {
            return false;
        }
        
        // 中层
        // 下
        boolean leftIsMirror = isMirror(t1.left,t2.right);
        boolean rightIsMirror = isMirror(t1.right,t2.left);
        // 回
        return t1.val == t2.val && leftIsMirror && rightIsMirror;
    }
}