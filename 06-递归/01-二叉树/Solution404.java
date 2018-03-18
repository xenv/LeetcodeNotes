/* 
    问题链接：https://leetcode.com/problems/sum-of-left-leaves/
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
class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
    //定义：左子叶子的和，isLeft时才计算
    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        // 底层1
        if (root == null) {
            return 0;
        }
        // 底层2
        if (root.left == null && root.right == null) {
            return isLeft ? root.val : 0;
        }
        // 中层 下+回
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
}