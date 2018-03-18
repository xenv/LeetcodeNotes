/* 
    问题链接：https://leetcode.com/problems/minimum-depth-of-binary-tree/
    难度系数 4
    时间复杂度 O(n) 空间 O(h)
   
*/

class Solution111 {
    public int minDepth(TreeNode root) {
        // 底层1
        if (root == null) {
            return 0;
        }
        // 底层2
        if(root.left == null && root.right == null) {
            return 1;
        }
        // 中层
        // 下
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        // 回
        if (leftDepth == 0 && rightDepth == 0) {
            return 0;
        }
        if (rightDepth == 0 && leftDepth != 0) {
            return leftDepth + 1;
        }
        if (leftDepth == 0 && rightDepth != 0) {
            return rightDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
        
    }
}