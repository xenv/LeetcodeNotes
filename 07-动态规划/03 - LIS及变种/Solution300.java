/* 
    问题链接：https://leetcode-cn.com/problems/longest-increasing-subsequence/
    难度系数 8
    时间复杂度 O(n^2)
   
*/

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] memo = new int[nums.length];
        // memo[i]: [0...i]的最长上升子序列长度
        memo[0] = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            // memo[i] 是 [0..i] 中，比nums[i] 小的 memo[j] 的值 的 最大值 + 1
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, memo[j]);
                }
            }
            memo[i] = max + 1;
            res = memo[i] > res ? memo[i] : res;
        }
        
        return res;
    }
}