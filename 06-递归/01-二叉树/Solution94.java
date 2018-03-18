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
        inorderTraversal(root, res);
        return res;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list){
        // 底层
        if(node == null){
            return ;
        }
        // 中层
        // 下
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
        // 回
        return ;
    }
}