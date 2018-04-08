/* 
    问题链接：https://leetcode-cn.com/problems/integer-break/
    难度系数 6
    时间复杂度 O(n^2)
   
*/

class Solution343 {
    public int integerBreak(int n) {
        if (n == 0 || n == 1) return 0;
        int[] memo = new int[n+1];
        for (int i = 1;i <= n; i++) {
            int res = -1;
            for (int j = i - 1; j > 0; j--) {
                res = Math.max(res, Math.max(j * (i - j), j * memo[i-j]));
            }
            memo[i] = res;
        }
        return memo[n];
    }
}