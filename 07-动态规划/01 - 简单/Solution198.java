/* 
    问题链接：https://leetcode-cn.com/problems/house-robber/
    难度系数 8
    时间复杂度 O(n^2)
   
*/

class Solution198 {
    // 在[0,end]中寻找最大值
    private int findMax(int[] nums, int start, int end) {
        if (end < start) return 0;
        if (nums.length == 0) return 0;
        int max = 0;
        for (int i = 0; i <= end; i++) {
            max = Math.max(max, nums[i]);
        }
        //System.out.println(max + "," + start + "," + end);
        return max;
    }
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        for (int i = 1; i < memo.length; i++) {
            memo[i] = findMax(memo, 0, i - 2) + nums[i];
        }
        //System.out.println(Arrays.toString(memo));
        return findMax(memo, 0, nums.length - 1);
    }
}