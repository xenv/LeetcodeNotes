/* 
    问题链接：https://leetcode.com/problems/intersection-of-two-arrays/
    难度系数 3
    难点在 Set 和 数组 之间转来转去，自动拆装箱有暗坑
    时间复杂度 O(n) 空间 O(n)
*/
class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for(int num: nums1) {
            nums1Set.add(num);
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if ( nums1Set.contains(nums2[i]) ) {
                res.add(nums2[i]);
            }
        }
        int[] resArray = new int[res.size()];
        int i = 0;
        for (Integer num : res) {
            resArray[i++] = num;
        }
        return resArray;
    }
}