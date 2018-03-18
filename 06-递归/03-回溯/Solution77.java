/* 
    问题链接：https://leetcode.com/problems/combinations/
    难度系数 5
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<Integer>(), res, 1, n, k);
        return res;
    }
    private void dfs (List<Integer> current, List<List<Integer>> res, int min, int max, int k) {
        
        // 底层
        if (current.size() == k) {
            res.add(new ArrayList<Integer>(current));
            return ;
        }
        // 中层
        // 下
        // 剪枝，还有 max - current.size() 的空位
        for (int i = min; i <= max - (k - current.size()) + 1; i++) {
            current.add(i);
            dfs(current, res, i + 1, max, k);
            current.remove(current.size() - 1);
        }
    }
}