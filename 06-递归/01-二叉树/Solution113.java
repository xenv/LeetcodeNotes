/* 
    问题链接：https://leetcode.com/problems/path-sum-ii/
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
class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        pathSum(root, new ArrayList<Integer>(), res,sum);
        return res;
    }
    private void pathSum(TreeNode root, ArrayList<Integer> current, List<List<Integer>> res, int sum) {
        // 底层1
        if (root == null) {
            return ;
        }
        
        // 底层2
        if (root.left == null && root.right == null) {
            int subSum = 0;
            current.add(root.val);
            for (Integer i: current) {
                subSum += i;    
            }
            
            if (subSum == sum) {
                res.add(current);
            }
            return ;
        }
        // 中层
        // 下
        current.add(root.val);
        pathSum(root.left, new ArrayList<Integer>(current), res, sum);
        pathSum(root.right, new ArrayList<Integer>(current), res, sum);
        // 回
        return ;
    }
//     public List<List<Integer>> pathSum(TreeNode root, int sum) {
//         List<List<Integer>> res = new ArrayList<>();
//         pathSum(root, new ArrayList<Integer>(), res,sum);
//         return res;
//     }
//     private void pathSum(TreeNode root, ArrayList<Integer> current, List<List<Integer>> res, int sum) {
//         // 底层1
//         if (root == null) {
//             return ;
//         }
//         current.add(root.val);
//         sum -= root.val;
//         // 底层2
//         if (root.left == null && root.right == null) {
//             if (sum == 0) {
//                 res.add(current);
//                 return ;
//             }  
//         }
//         // 中层
        
//         // 下
//         pathSum(root.left, new ArrayList<Integer>(current), res, sum);
//         pathSum(root.right, new ArrayList<Integer>(current), res, sum);
//         // 回
//         return ;
//     }    
}