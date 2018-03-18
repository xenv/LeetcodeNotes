/* 
    问题链接：https://leetcode.com/problems/permutations/
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<Integer>(), res, nums);
        return res;
    }
    
    private void dfs(List<Integer> current, List<List<Integer>> res, int[] nums) {
        
        // 底层
        if (nums.length == current.size()) {
            res.add(new ArrayList<>(current));
            return ;
        }
        
        // 中层
        // 下
        for (int num: nums) {

            if (current.contains(num)) {
                continue;
            }

            current.add(num);
            dfs(current, res, nums);
            // 清理
            current.remove(current.size() - 1);
        }
    }
}