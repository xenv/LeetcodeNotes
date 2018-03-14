/* 
    问题链接：https://leetcode.com/problems/evaluate-reverse-polish-notation/
    难度系数 4
    时间复杂度 O(n) 空间 O(1)
   
*/
class Solution150 {
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<Integer>();

      for (String s: tokens) {
        switch (s) {
          case "+":
            stack.push(stack.pop() + stack.pop());
            break;

          case "-":
            stack.push(-stack.pop() + stack.pop());
            break;

          case "*":
            stack.push(stack.pop() * stack.pop());
            break;

          case "/":
            int n1 = stack.pop(), n2 = stack.pop();
            stack.push(n2 / n1);
            break;

          default:
            stack.push(Integer.parseInt(s));
        }
      }

      return stack.pop();
    }
}