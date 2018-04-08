/* 
    问题链接：https://leetcode-cn.com/problems/unique-paths/
    难度系数 5
    时间复杂度 O(n^2)
   
*/

class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m+1][n+1];
        // 填第一行
        for (int x = 1; x <= n; x++) {
            memo[1][x] = 1;
        }
        // 填第一列
        for (int y = 1; y <= m; y++) {
            memo[y][1] = 1;
        }
        for (int y = 2; y <= m; y++) {
            for (int x = 2; x <= n; x++) {
                memo[y][x] = memo[y-1][x] + memo[y][x - 1];
            }
        }
        return memo[m][n];
    }
}