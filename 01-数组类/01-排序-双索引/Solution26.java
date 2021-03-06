/* 
    问题链接：https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    难度系数 3
*/
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if ( nums == null ) {
            return 0;
        }
        
        // 双指针 时间 O(n) 空间 O(1)
        // i: 从头遍历到尾
        // k: [0..k) 为排序好的，不重复的数组
        // 暗坑：和前面/后面一个数比较，要考虑到数组两边会有一个数直接被跳过了
        int k = 1;
        for ( int i = 1; i<nums.length; i++ ) {
            if (nums[i-1] < nums[k]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}