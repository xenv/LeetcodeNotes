/* 
    问题链接：https://leetcode.com/problems/intersection-of-two-arrays-ii
    难度系数 5
    时间复杂度 O(n) 空间 O(n)
*/
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Map问题
        Map<Integer,Integer> map = new HashMap<>();
        for ( int num : nums1) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int num: nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] ret = new int[result.size()];
        int index = 0;
        for(Integer num: result) {
            ret[index++] = num;
        }

        return ret;
    }
}