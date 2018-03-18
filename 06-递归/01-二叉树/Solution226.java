/* 
    问题链接：https://leetcode.com/problems/invert-binary-tree/
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
class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        // 底层1
        if (root == null) {
            return null;
        }
        // 中层
        // 下
        invertTree(root.left);
        invertTree(root.right);
        // 回：交换子节点
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}