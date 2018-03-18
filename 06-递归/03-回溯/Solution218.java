/* 
    问题链接：https://leetcode.com/problems/combination-sum-iii
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution218 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<Integer>(), res, k, n, 1);
        return res;
    }
    private void dfs (List<Integer> current, List<List<Integer>> res, int k, int n, int minIndex) {
        // 底层
        if (n < 0 || current.size() > k) {
            return ;
        }
        if (n == 0 && current.size() == k) {
            res.add(new ArrayList<Integer>(current));
        }
        // 中层
        for (int i = minIndex; i <=9; i++) {
            if (current.contains(i)) continue;
            current.add(i);
            dfs(current, res, k, n - i, i + 1);
            current.remove(current.size() - 1);
        }
    }
}