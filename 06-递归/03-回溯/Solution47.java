/* 
    问题链接：https://leetcode.com/problems/permutations-ii/
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res =  new ArrayList<>();
        Arrays.sort(nums);
        dfs(new ArrayList<>(), res, nums, new boolean[nums.length]);
        return res;
    }
    private void dfs (List<Integer> current, List<List<Integer>> res, int[] nums, boolean[] used) {
        // 底层
        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        // 中层
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i-1] && used[i - 1]) {
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            dfs(current, res, nums, used);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}