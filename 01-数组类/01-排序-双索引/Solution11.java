/* 
    问题链接：https://leetcode.com/problems/container-with-most-water/
    难度系数 7
*/
class Solution11 {
   	public int maxArea(int[] height) {
        if ( height == null ) {
            return 0;
        }
        // 时间O(n) 空间O(1)
        // 双指针对撞 [l..r] 一边和另一边的高度比较，从远到近，选最大的，实现简单，思路很难想到
        int l = 0, r = height.length - 1;
        int res = 0;
        while( l<=r ) {
            res = Math.max(res,area(height, l, r));
            if ( height[l] < height[r] ) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
    private int area(int[] height, int x, int y) {
        return Math.min(height[x], height[y]) * (y -x);
    }
}