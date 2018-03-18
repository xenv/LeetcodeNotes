/* 
    问题链接：https://leetcode.com/problems/combination-sum/
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<>(), res, candidates, target,0);
        return res;
    }
    private void dfs(List<Integer> current, List<List<Integer>> res, int[] candidates, int target, int minIndex) {
        // 底层1
        if (target < 0) {
            return ;
        }
        // 底层2
        if (target == 0) {
            res.add(new ArrayList<Integer>(current));
        }
        // 中层
        // 下
        for (int i = minIndex; i < candidates.length; i++) {
            current.add(candidates[i]);
            dfs(current, res, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
}