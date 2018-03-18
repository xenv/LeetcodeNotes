/* 
    问题链接：https://leetcode.com/problems/path-sum/
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
class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        // 底层1
        if (root == null) {
            return false;
        }
        // 底层2
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        // 中层 
        // 下
        boolean hasLeftPathSum = hasPathSum(root.left, sum - root.val);
        boolean hasRightPathSum = hasPathSum(root.right, sum - root.val);
        // 回
        return hasLeftPathSum || hasRightPathSum;     
    }
}