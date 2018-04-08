/* 
    问题链接：https://leetcode-cn.com/problems/unique-paths-ii/
    难度系数 6
    时间复杂度 O(n^2)
   
*/

class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) return 1;
        int n = obstacleGrid[0].length;
        int[][] memo = new int[m+1][n+1];
        for (int y = 1; y <= m; y++) {
            for (int x = 1; x <= n; x++) {
                if (obstacleGrid[y - 1][x - 1] == 1) {
                    memo[y][x] = 0;
                    continue;
                }
                if (y == 1 && x == 1) {
                    memo[y][x] = 1;
                    continue;
                }
                int topRes = getRes(memo, y-1, x);
                int leftRes = getRes(memo, y, x - 1);
                memo[y][x] = topRes + leftRes;
            }
        }
        return memo[m][n];     
    }
    // 安全获取 (x,y)的值，不存在返回0
    private int getRes(int[][] memo, int y, int x) {
        if (y <= 0 || x <= 0 ) {
            return 0;
        } else {
            return memo[y][x];
        }
    }
    
}