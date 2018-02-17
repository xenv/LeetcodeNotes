/* 
    问题链接：https://leetcode.com/problems/minimum-window-substring/
    难度系数 9
    此题用了一个非常难看的 O(n) 算法，待优化具体逻辑
*/
class Solution78 {
    public String minWindow(String s, String t) {
        // chars
        char[] chars = s.toCharArray();

        // 结果
        String res = s;

        if ( s== null || t == null ) {
            return "";
        }

        //  map
        int[] map = new int[256];
        // 浮动窗口 [l..r]
        int l = 0, r = -1;
        // 计数器
        int count = 0;
        // tLen
        int tLen = t.length();
        // Change Flag
        boolean flag = false;
        // lastLong
        int lastSum = -1;

        // 读取 t 进 map
        for ( char c : t.toCharArray() ) {
            map[c] ++;
        }

        // 进行窗口滑动
        while ( l <= chars.length - tLen ) {

            if ( r + 1 < chars.length && count < tLen && map[chars[++r]] -- >= 1 )  {
                count ++;
            } else  if  ( count == tLen && map[chars[l++]] ++ >= 0 ){
                count --;
            }

            if ( count == tLen ) {
                if (  r - l + 1 <= res.length() ) {
                    res = new String(Arrays.copyOfRange(chars,l,r+1));
                    flag = true;
                }
            }

            if (lastSum == r + l ) {
                //break;
            }

            lastSum = r + l;
        }
        if ( flag ) {
            return res;
        } else {
            return "";
        }

    }
}