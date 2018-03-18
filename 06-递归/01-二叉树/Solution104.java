/* 
    问题链接：https://leetcode.com/problems/maximum-depth-of-binary-tree
    难度系数 2
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
class Solution104 {
    public int maxDepth(TreeNode root) {
        // 底层
        if (root == null) {
            return 0;
        }
        // 中层
        // 下
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        // 回
        return Math.max(leftMaxDepth,rightMaxDepth) + 1;
    }
}