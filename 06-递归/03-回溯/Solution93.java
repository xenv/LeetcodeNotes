/* 
    问题链接：https://leetcode.com/problems/restore-ip-addresses/
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        dfs("", res, 0, s, 0);
        return res;
    }
    private void dfs(String current, List<String> res, int index, String s, int count) {
        // 底层1
        if (count > 4) {
            return;
        }
        // 底层2
        if (count == 4 && index == s.length()) {
            res.add(current); 
        }
        // 中层
        // 下
        for (int i = 1; i <= 3; i++) {
            if (index+i > s.length()) break;
            String partOfIP = s.substring(index,index+i);
            if ((partOfIP.startsWith("0") && partOfIP.length()>1) || (i==3 && Integer.parseInt(partOfIP) >= 256)) 
                continue;
            dfs(current + partOfIP + (count==3?"" : "."), res, index + i, s, count+1) ;
        }
    }
}