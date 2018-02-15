/* 
    问题链接：https://leetcode.com/problems/kth-largest-element-in-an-array
    难度系数 5
*/
class Solution215 {
    public void sortColors(int[] nums) {
        // 简单快排思路
        // 定义两个循环指针 [l,r] 为搜索范围
        // 选取标点l，定义指针 k ,[l+1,k]>l [k+1,r]<l 返回 k ，得到标点l的位置
        // 判断需要寻找的 k 和 标点l 的位置，缩小范围继续寻找
        int l = 0, r = nums.length-1;
        while ( l <= r ) {
            int p = partition(nums,l,r); //返回第一个数在数组中的排序号p，并且已经把比这个数小的数排到该数左边，比这个数大的数排到该数右边
            if ( p == k-1 ){ // 如果命中，则直接返回该数
                return nums[p];
            }
            else if ( p < k-1 ) { // k-1的序号比p大，在[p+1,r]中继续寻找
                l = p + 1;
            }
            else if (p > k-1 ) { // k的序号比p小， 在[l,p-1]中继续寻找
                r = p - 1;
            }
        }
        return 0;
    }
    private int partition(int[] nums, int l, int r) {
        int k = l;
        int v = nums[l];
        for ( int i = l+1; i <= r ; i++ ) {
            if ( nums[i] > v ) {
                k++;
                swap(nums, i, k);
            }
        }
        swap(nums,l,k);
        return k;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}