/* 
    问题链接：https://leetcode.com/problems/find-all-anagrams-in-a-string
    难度系数 8
*/
class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if ( s == null || p == null ) {
            return res;
        }
        // map
        int[] map = new int[256];
        // 读取进map
        for ( char c : p.toCharArray() ) {
            map[c] ++;
        }
        // 浮动窗口[l..r]
        int l = 0, r = -1;
        int pLen = p.length();
        char[] chars = s.toCharArray();
        int count = 0;
        // 滑动
        while ( l <= chars.length - pLen  ) { //难点1，确定继续条件，是 chars.length - pLen 的后一个
            if ( r < chars.length && map[chars[++r]]-- >= 1 ) { //难点2，确定>=1，因为读进map中可能有>1的情况
                count ++;
            }
            if ( count == pLen ) {
                res.add(l);
            }
            if ( r - l + 1 == pLen && map[chars[l++]]++ >= 0 ) {
                count --;
            }
        }
        return res;
    }
}