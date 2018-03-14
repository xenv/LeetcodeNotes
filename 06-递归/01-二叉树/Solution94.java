/* 
    问题链接：https://leetcode.com/problems/binary-tree-inorder-traversal
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
class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode node, List<Integer> list){
        if(node != null){
            helper(node.left, list);
            list.add(node.val);
            helper(node.right, list);
        }
    }
}