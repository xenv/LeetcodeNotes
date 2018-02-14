/* 
    问题链接：https://leetcode.com/problems/remove-element/
    难度系数 2
*/
class Solution27 {
    public int removeElement(int[] nums, int val) {
    	if ( nums == null ){
            return 0;
        }

    	//双指针 i,k
        //i 遍历全部
        //[0,k) 不包含 val

        int k = 0;
        for ( int i = 0; i<nums.length; i++ ) {
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}