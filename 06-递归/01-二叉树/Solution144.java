/* 
    问题链接：https://leetcode.com/problems/binary-tree-preorder-traversal/
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
class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode node, List<Integer> list){
        if(node != null){
            list.add(node.val);
            helper(node.left, list);
            helper(node.right, list);
        }
    }
}