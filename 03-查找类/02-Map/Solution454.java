/* 
    问题链接：https://leetcode.com/problems/4sum-ii/
    难度系数 5
    时间复杂度 O(n^2) 空间 O(n^2)
*/
class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int numC: C) {
            for ( int numD: D) {
                map.put(numC+numD, map.getOrDefault(numC+numD, 0) + 1);
            }
        }
        for(int numA: A) {
            for ( int numB: B) {
                int target = -1 * (numA + numB);
                if (map.get(target) != null) {
                    res += map.get(target);
                }
            }
        }
        return res;
    }
}