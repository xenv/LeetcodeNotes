/* 
    问题链接：https://leetcode.com/problems/sum-root-to-leaf-numbers/
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
class Solution129 {
//     public int sumNumbers(TreeNode root) {
//         List<List<Integer>> res = new ArrayList<>();
//         sumNumbers(root, new ArrayList<Integer>(), res);
//         int sum = 0;
//         for(List<Integer> numList: res) {
//             int sumThis = 0;
//             for(int num: numList) {
//                 sum = sum * 10 + numList.get(i);
//                 
//             }
//             sum += sumThis;
//         }
//         return sum;
//     }
//     private void sumNumbers(TreeNode root, List<Integer> current, List<List<Integer>> res) {
//         // 底部1
//         if (root == null) {
//             return ;
//         }
//         current.add(root.val);
//         // 底部2
//         if (root.left == null && root.right == null) {
//             res.add(current);
//             return ;
//         }
//         // 中部
//         // 下
//         sumNumbers(root.left, new ArrayList<Integer>(current), res);
//         sumNumbers(root.right, new ArrayList<Integer>(current), res);
//         // 回
//         return ;
        
    
//     }
    
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
    
    public int sumNumbers(TreeNode root, int sum) {
        // 底层 1
        if (root == null) {
            return 0;
        }
        // 通用操作
        sum = sum * 10 + root.val;
        // 底层 2
        if (root.left == null && root.right == null) {
            return sum;
        }
        // 下+回
        return sumNumbers(root.left, sum) + sumNumbers(root.right, sum);
    }
}