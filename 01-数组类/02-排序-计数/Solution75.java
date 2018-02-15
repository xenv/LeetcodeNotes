/* 
    问题链接：https://leetcode.com/problems/sort-colors
    难度系数 3
*/
class Solution75 {
    public void sortColors(int[] nums) {
        // 解法2，使用计数排序算法，时间O(nk),k为计数个数,空间O(k)
        if ( nums == null || nums.length <= 1){
            return ;
        }
        
        // 新建计数器
        int[] count = {0,0,0};
        // 扫描一遍记录数量
        for ( int i = 0; i < nums.length; i++ ) {
            assert(nums[i]<=2 || nums[i]>=0) ;
            count[nums[i]]++;
        }
        // 读取计数器
        // 记录位置
        int k = 0;
        for( int i = 0; i < count.length; i++ ) {
            for ( int j = 0; j < count[i]; j++ ) {
                nums[k++] = i;
            }
        }
    }
    
}