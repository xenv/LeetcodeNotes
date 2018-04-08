/* 
    问题链接：https://leetcode.com/problems/n-queens/
    难度系数 9
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution51 {
    private boolean[] col;
    private boolean[] dia1;
    private boolean[] dia2;
    private ArrayList<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        putQueen(n, 0, new LinkedList<Integer>());
        return res;
    }
    // 共有n列, 摆放第index行的皇后位置，按顺序存在 row
    private void putQueen(int n, int index, LinkedList<Integer> row){
        // 到底
        if(index == n){
            res.add(generateBoard(n, row));
            return;
        }
        // 中间 试一下每一列
        for(int i = 0 ; i < n ; i ++)
            // 尝试将第index行的皇后摆放在第i列
            if(!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]){
                row.addLast(i);
                col[i] = true;
                dia1[index + i] = true;
                dia2[index - i + n - 1] = true;
                // 下
                putQueen(n, index + 1, row);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                row.removeLast();
            }
        // 回
        return;
    }
    private List<String> generateBoard(int n, LinkedList<Integer> row){
        ArrayList<String> board = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            char[] charArray = new char[n];
            Arrays.fill(charArray, '.');
            charArray[row.get(i)] = 'Q';
            board.add(new String(charArray));
        }
        return board;
    }
}