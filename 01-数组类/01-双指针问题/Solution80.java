/* 
    问题链接：https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    难度系数 3
*/
class Solution80 {
    public int removeDuplicates(int[] nums) {
        if( nums == null || nums.length == 0) {
            return 0;
        }
        if ( nums.length <= 2){
            return nums.length;
        }
        
        //双指针i,k
        //i遍历全局
        //[0,k]存放一个，“一个数最多只重复两次” 的数组
        //原理和Solution26基本一样，注意暗坑
        int k = 2;
        for ( int i = 2; i<nums.length; i++) {
            if ( nums[i] != nums[k-2] ) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}