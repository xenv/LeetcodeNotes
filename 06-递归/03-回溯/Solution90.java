/* 
    问题链接：https://leetcode.com/problems/subsets-ii/
    难度系数 5
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<Integer>(), res, nums, 0);
        return res;
    }
    private void dfs(List<Integer> current, List<List<Integer>> res, int[] nums, int minIndex) {
        //底层
        if (minIndex > nums.length) {
            return ;
        }
        res.add(new ArrayList<Integer>(current));
        for (int i = minIndex; i < nums.length; i++) {
            if (i > minIndex && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            dfs(current, res, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}