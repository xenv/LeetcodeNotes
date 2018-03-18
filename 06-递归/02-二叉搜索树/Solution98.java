/* 
    问题链接：https://leetcode.com/problems/validate-binary-search-tree
    难度系数 6
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
class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    private boolean isValidBST(TreeNode root, long max, long min) {
        // 底层1
        if (root == null) {
            return true;
        }
        // 中层
        // 下
        boolean leftIsValid = isValidBST(root.left, root.val, min);
        boolean rightIsValid = isValidBST(root.right, max, root.val);
        // 回
        return root.val < max && root.val > min && leftIsValid && rightIsValid;
    }
}