/* 
    问题链接：https://leetcode.com/problems/reverse-vowels-of-a-string/
    难度系数 3
*/
class Solution345 {
    public String reverseString(String s) {
    	// 简单的双指针对撞
    	// i 左指针 r 右指针
    	if( s == null) {
    		return null;
    	}
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length -1;
        String pool = "aeiouAEIOU";
        while ( l<=r ) {
            if ( pool.indexOf(chars[l]) < 0 ) {
                l++;
            } else if ( pool.indexOf(chars[r]) < 0 ) {
                r--;
            } else {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                r--;
                l++;
            }
        }
        return new String(chars);
    }
}