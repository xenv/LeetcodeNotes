/* 
    问题链接：https://leetcode.com/problems/sort-colors
    难度系数 3
*/
class Solution75 {
    public void sortColors(int[] nums) {
        //解法1，两次双指针算法
        //i指针，遍历全部
        //k指针，[0,k) 存 0,1 [k,nums.length) 存 2
        int k = 0;
        for ( int i = 0; i<nums.length; i++ ) {
            if ( nums[i] != 2 ) {
                swap(nums, i, k);
                k++;
            }
        }
        //在[0,k)中用双指针算法
        //i指针，遍历全部
        //p指针，[0,p) 存 0 ，[p,k) 存 1
        int p = 0;
        for ( int i = 0 ; i<k; i++ ) {
            if ( nums[i] == 0 ) {
                swap(nums, i, p);
                p++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}