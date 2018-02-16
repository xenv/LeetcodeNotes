/* 
    问题链接：https://leetcode.com/problems/minimum-size-subarray-sum/
    难度系数 7
*/
class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        if ( nums == null || nums.length < 1 ) {
            return 0 ;
        }
        int res = nums.length + 1 ;
        // 双指针 滑动窗口 
        // 定义一个滑动窗口 [l..r] 如果 [l...r]的和小于s，则 r 右移多加一个数，大于s则让 l 右移减少一个数
        // 难点在于，判断滑动窗口的结束条件是 l到末尾 ，并且要判断r是否越界
        int l = 0, r = -1;
        int sum = 0;
        while ( l  < nums.length ) {
            if ( r+1 < nums.length && sum < s ) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }
            if ( sum >= s ) {
                res = Math.min(res, r - l + 1 );
            }
        }
        if ( res == nums.length + 1 ) {
            return 0;
        }
        return res;
    }
}