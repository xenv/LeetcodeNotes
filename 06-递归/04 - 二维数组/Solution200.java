/* 
    问题链接：https://leetcode.com/problems/number-of-islands/
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution200 {
    private boolean[][] visited;
    private int height,width;
    private int[][] d = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        // 洪水泛滥 算法，深度优先
        height = grid.length;
        if (height == 0) {
            return 0;
        }
        width = grid[0].length;
        
        visited = new boolean[height][width]; // (y,x)
        int res = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (grid[y][x] == '1' && !visited[y][x]) {
                    res ++;
                    dfs(grid,y,x);
                }
            }
        }
        return res;
    }
    private void dfs(char[][] grid, int y, int x) {
        // 底部1
        if (x >= width || y >= height || x<0 || y<0 || grid[y][x] == '0') {
            return ;
        }
        // 底部2
        if (visited[y][x]) {
            return ;
        }
        // 还没访问过，第一次访问
        visited[y][x] = true;
        // 下
        for(int i = 0; i < d.length; i++) {
            dfs(grid,y + d[i][1], x + d[i][0]);
        }
        // 回
        
    }
}