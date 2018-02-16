/* 
    问题链接：https://leetcode.com/problems/longest-substring-without-repeating-characters
    难度系数 6
*/
    
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if ( s == null ){
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] map = new int[255];

        // 双指针+滑动窗口 [l..r] 如果没有重复就 r++ 有重复就 l++ 记录最长子串的长度
        int l = 0, r = -1;
        int res = 0;
        while ( l < chars.length ) {
            if ( r+1 < chars.length && map[chars[r+1]] == 0 ) { //如果r还没到边，并且下一个字符不在原来字符中
                map[chars[++r]] ++; // r右移，把这个数登记到 ap
            } else { //如果r到边或者下个字符串在原来字符中
                map[chars[l++]] --; // l右移，把map中的数去除
            }
            // 字符串始终是合法的
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}