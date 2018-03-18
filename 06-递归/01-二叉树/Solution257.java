/* 
    问题链接：https://leetcode.com/problems/binary-tree-paths/
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
class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        
        // List<String> res = new ArrayList<>();
        //  // 底层1，传进来直接为空
        // if (root == null) {
        //     return res;
        // }
        // // 底层2，叶节点，在list新建一个区域
        // if (root.left == null && root.right == null) {
        //     res.add(String.valueOf(root.val));
        //     return res;
        // }
        // // 中层
        // // 下
        // List<String> leftS = binaryTreePaths(root.left);
        // List<String> rightS = binaryTreePaths(root.right);
        // // 回
        // for(String s: leftS) {
        //     res.add(String.format("%s->%s", root.val, s));
        // }
        // for(String s: rightS) {
        //     res.add(String.format("%s->%s", root.val, s));
        // }
        // return res;
        ArrayList<String> res = new ArrayList<>();
        binaryTreePaths(root, "", res);
        return res;
    }
    public void binaryTreePaths(TreeNode root, String solution, ArrayList<String> res) {
        // 底层 1
        if (root == null) {
            return;
        }
        // 底层 2，新建一个空间，接收所有 solution
        if (root.left == null && root.right == null) {
            res.add(solution + root.val);
            return ;
        }
        // 中层
        // 下
        binaryTreePaths(root.left, solution + root.val + "->", res);
        binaryTreePaths(root.right, solution + root.val + "->", res);
        // 回
        return ;
    }
}