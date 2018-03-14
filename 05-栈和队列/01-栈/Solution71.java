/* 
    问题链接：https://leetcode.com/problems/simplify-path
    难度系数 4
    时间复杂度 O(n) 空间 O(1)
   
*/
class Solution71 {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String t: tokens) {
            if ("..".equals(t)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!t.isEmpty() && !".".equals(t)) {
                stack.push(t);
            }
        }
        StringBuffer res = new StringBuffer();
        for ( String s : stack) {
            res.append('/');
            res.append(s);
        }
        if (res.length() == 0) {
            res.append('/');
        }
        return res.toString();
        
    }
}