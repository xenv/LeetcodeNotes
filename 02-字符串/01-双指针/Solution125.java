/* 
    问题链接：https://leetcode.com/problems/valid-palindrome/
    难度系数 3
*/
class Solution125 {
    public boolean isPalindrome(String s) {
    	if( s == null) {
    		return false;
    	}
        //对撞指针问题，【l..r] 双指针对撞
        int l = 0, r = s.length()-1;
        s = s.toLowerCase();
        String pool = "abcdefghijklmnopqrstuvwxyz0123456789";
        while ( l <= r ) {
            if ( pool.indexOf(s.charAt(l)) < 0 ) {
                l++;
            } else if ( pool.indexOf(s.charAt(r)) < 0 ) {
                r--;
            } else if ( s.charAt(l) != s.charAt(r) ) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}