/* 
    问题链接：https://leetcode.com/problems/binary-tree-postorder-traversal
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
class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode node, List<Integer> list) {
        if(node != null){
            helper(node.left, list);
            helper(node.right, list);
            list.add(node.val);
        }
    }
}