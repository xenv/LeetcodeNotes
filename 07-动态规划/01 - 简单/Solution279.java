/* 
    问题链接：https://leetcode-cn.com/problems/perfect-squares/
    难度系数 6
    时间复杂度 O(n^2)
   
*/

class Solution279 {
    public int numSquares(int n) {
        int[] memo = new int[n + 1];
        for (int i = 1; i<= n; i++) {
            int currentRes = i;
            
            for (int j = 1; j * j <= i; j++) {
                int spare = i - j * j;
                int spareRes = memo[spare];
                currentRes = Math.min(currentRes, spareRes + 1);
            }
            
            memo[i] = currentRes;
        }
        return memo[n];
    }
}