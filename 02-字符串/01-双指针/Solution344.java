/* 
    问题链接：https://leetcode.com/problems/reverse-string2
    难度系数 2
*/
class Solution344 {
    public String reverseString(String s) {
    	// 对称的双指针对撞可以转换成单指针，要小心定义
    	// i 左指针 s.length-1-i 右指针
    	if( s == null) {
    		return null;
    	}
        char[] chars = s.toCharArray();
        for ( int i = 0; i < s.length() / 2; i++ ) {
            char temp = chars[i];
            chars[i] = chars[s.length()-i-1];
            chars[s.length()-i-1] = temp;
        }
        return new String(chars);
    }
}