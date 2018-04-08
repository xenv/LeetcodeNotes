/* 
    问题链接：https://leetcode-cn.com/problems/triangle
    难度系数 4
    时间复杂度 O(n)
   
*/

class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int pool[] = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0 ; j < triangle.get(i).size(); j++) {
                pool[j] = Math.min(pool[j],pool[j+1]) + triangle.get(i).get(j);
            }
        }
        return pool[0];
    }
}