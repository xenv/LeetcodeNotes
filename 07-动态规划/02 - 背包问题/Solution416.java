/* 
    问题链接：https://leetcode-cn.com/problems/partition-equal-subset-sum/
    难度系数 8
    时间复杂度 O(n * sum)
   
*/

class Solution416 {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        // 想办法找到一组数恰好和为 sum/2
        // 计算和
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[] pool = new boolean[target + 1];
        pool[0] = true;
        if (nums[0] <= target) {
            pool[nums[0]] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                pool[j] = pool[j] || pool[j - nums[i]];
            }
        }
        return pool[target];
        
    }
}