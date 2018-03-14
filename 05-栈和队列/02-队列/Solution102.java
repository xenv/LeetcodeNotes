/* 
    问题链接：https://leetcode.com/problems/binary-tree-level-order-traversal/
    难度系数 5
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
class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            // 清空队列，新建一层
            int size = queue.size();

            for(int i=0; i<size; i++) {
                TreeNode front = queue.removeFirst();
                list.add(front.val);
                if(front.left != null) {
                    queue.addLast(front.left);   
                }
                if(front.right != null) {
                    queue.addLast(front.right);   
                }
            }
            res.add(list);
        }
        return res;
    }
}