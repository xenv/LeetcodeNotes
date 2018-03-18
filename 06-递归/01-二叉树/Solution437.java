/* 
    问题链接：https://leetcode.com/problems/path-sum-iii/
    难度系数 8
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
class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        //底层
        if (root == null) {
            return 0;
        }
        // 中层
        int res = findPath(root, sum);
        // 下
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        // 回
        return res;
    }
    private int findPath (TreeNode node, int num) {
        // 底层
        if (node == null) {
            return 0;
        }
        // 中层
        int res = 0;
        if (node.val == num) {
            res ++;
        }
        // 下
        res += findPath(node.left, num - node.val);
        res += findPath(node.right, num - node.val);
        // 回
        return res;
    }
}