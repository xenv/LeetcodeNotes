/* 
    问题链接：https://leetcode.com/problems/number-of-boomerangs/
    难度系数 5
    
*/
class Solution447 {
    public int numberOfBoomerangs(int[][] points) { 
        int res = 0;
        for (int i = 0; i<points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j<points.length; j++) {
                if (i != j) {
                    int dis = distance(points[i],points[j]);
                    int n = map.getOrDefault(dis, 0);
                    res += 2*n;
                    map.put(dis, n + 1);
                }
            }
        }
        return res;
    }
    private int distance(int[] pointA, int[] pointB) {
        return (pointA[0] - pointB[0]) * (pointA[0] - pointB[0]) + 
            (pointA[1] - pointB[1]) * (pointA[1] - pointB[1]);
    }
}