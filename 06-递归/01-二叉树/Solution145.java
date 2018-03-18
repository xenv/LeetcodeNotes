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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode node, List<Integer> list){
        // 底层
        if(node == null){
            return ;
        }
        // 中层
        // 下
        list.add(node.val);
        preorderTraversal(node.left, list);
        preorderTraversal(node.right, list);
        // 回
        return ;
    }
}