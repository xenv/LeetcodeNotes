/* 
    问题链接：https://leetcode-cn.com/problems/assign-cookies
    难度系数 2
    时间复杂度 O(n)
   
*/

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int scannerG = g.length - 1;
        int scannerS = s.length - 1;
        int res = 0;
        while (scannerS >= 0 && scannerG >= 0) {
            if (s[scannerS] >= g[scannerG]) {
                res ++;
                scannerS--;
            }
            scannerG--;
        }
        return res;
    }
}