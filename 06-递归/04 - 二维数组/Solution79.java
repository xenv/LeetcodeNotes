/* 
    问题链接：https://leetcode.com/problems/word-search
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution79 {
    private int[][] d = {{-1,0}, {0,1}, {1,0}, {0, -1}};
    private boolean[][] visited;
    private int h,w;
    public boolean exist(char[][] board, String word) {
        h = board.length;
        w = board[0].length;
        visited = new boolean[h][w];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // board[x][y] 寻找 index + 1 
    private boolean dfs(char[][] board, String word, int y, int x, int index) {
        //System.out.println("x=" + x + ", y = " + y);
        // 底部，判断是否在合法区域内
        if (y >= h || x >= w || x < 0 || y < 0) {
            return false;
        }
        // 底部，判断是否已经访问过
        if (visited[y][x]) {
            return false;
        }
        // 底部
        if (index == word.length() - 1) {
            return board[y][x] == word.charAt(index);
        }
        
        // 下
        if (board[y][x] == word.charAt(index)) {
            visited[y][x] = true;
            boolean res = false;
            // 对了一个，继续寻找
            for (int i = 0;i < 4; i++) {
                int newX = x + d[i][0];
                int newY = y + d[i][1];
                if (dfs(board, word, newY, newX, index + 1)) {
                    return true;
                }
            }
            visited[y][x] = false;
            return false;
        }
        return false;
    }
}
}