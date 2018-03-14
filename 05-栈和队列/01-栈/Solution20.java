/* 
    问题链接：https://leetcode.com/problems/valid-parentheses/
    难度系数 2
    时间复杂度 O(n) 空间 O(1)
   
*/
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String left = "({[";
        String right = ")}]";
        for(char c : s.toCharArray()) {
            if (left.indexOf(c) > -1) {
              stack.push(c);  
            } else {
                if (stack.isEmpty() || right.indexOf(c) != left.indexOf(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}