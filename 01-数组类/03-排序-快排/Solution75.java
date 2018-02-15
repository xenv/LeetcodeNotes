/* 
    问题链接：https://leetcode.com/problems/sort-colors
    难度系数 5
*/
class Solution75 {
    public void sortColors(int[] nums) {
        // 三路快排，三指针 时间O(n) 空间O(1)
        // [0...zero] 全部为0
        // [two...nums.length) 全部为2
        // 遍历 i
        // (zero...i) 全部为1
        // [i...two) 待排序
        int zero = -1, two = nums.length;
        for ( int i = 0; i<two ; ) { // 有一种情况不需要i++
            if ( nums[i] == 1 ) {
                i ++; // i为1，直接移
            } else if ( nums[i] == 2 ) {
                swap (nums, i, --two); // i为2 ， 移到two前面一个，移动two，继续判断i，不移动
            } else {
                assert ( nums[i] == 0 ) ;
                swap (nums, i++, ++zero); // i为0，移动zero后面一个，i移动到后面一个
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}