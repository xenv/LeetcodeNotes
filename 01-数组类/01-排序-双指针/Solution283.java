/* 
    问题链接：https://leetcode.com/problems/move-zeroes/
    难度系数 3
*/
class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        //双指针 i, k
        //i遍历全局
        //[0,k)存不含0的数组
        int k = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            if ( nums[i] != 0 ){
                nums[k] = nums[i];
                k++;
            }
        }
        //将[k,nums.length)部分变成0
        for ( ; k<nums.length; k++ ) {
            nums[k] = 0;
        }
    }
}