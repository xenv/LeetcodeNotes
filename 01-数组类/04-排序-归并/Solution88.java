/* 
    问题链接：https://leetcode.com/problems/merge-sorted-array
    难度系数 5
*/
class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ( nums1 == null || nums2 == null ) {
            return ;
        }
        
        // 归并排序思想，三指针
        // aux = nums1
        // aux[0,m) 为 nums1 的数字 定一个标记点 l [l,m) 还没使用
        // nums2[0,n) 为nums2 的数字，定一个标记点 r [r,n) 还没使用
        // nums1[0,n+m) 需要一个遍历全局 i 
        // Ps 数据量小的情况下，远慢于系统的三路快排 Arrays.sort()
        int[] aux = Arrays.copyOfRange(nums1, 0, m );
        int l = 0,r = 0;
        for (int i = 0; i < m + n; i++) {
            // [0,m)已经用完
            if ( l >= m ) {
                nums1[i] = nums2[r++];
            }
            // [0,n)已经用完
            else if ( r >= n ) {
                nums1[i] = aux[l++];
            }
            // 都没用完
            else if ( aux[l] < nums2[r] ) {
                // l位置的数比较小
                nums1[i] = aux[l++];
            }else {
                // r位置的数比较小
                nums1[i] = nums2[r++];
            }
        }
    }
}