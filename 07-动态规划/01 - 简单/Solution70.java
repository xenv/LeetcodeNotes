/* 
    问题链接：https://leetcode-cn.com/problems/climbing-stairs/
    难度系数 4
    时间复杂度 O(n)
   
*/

class Solution70 {
    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        // 走9层 = 走8层 + 走7层，变量池 3 个位置即可
        int[] pool = new int[3];
        pool[0] = 1;
        pool[1] = 1;
        for (int i = 2; i <= n; i++) {
            pool[2] = pool[0] + pool[1];
            pool[0] = pool[1];
            pool[1] = pool[2];
        }
        return pool[2];
        
    }
}