/* 
    问题链接：https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    难度系数 6
    时间复杂度 O(2^n) 空间 O(h)
   
*/
class Solution19 {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<String>();
        if(digits == null || digits.length() == 0) {
            return res;
        }
        combination("",digits, 0, res);
        return res;
    }
    // 寻找 digits[index] 的字符串，合并到 res 
    private void combination(String current, String digits, int index, List<String> res) {
        //底层 1
        if (index == digits.length()) {
            res.add(current);
            return;
        }
        String letters = KEYS[(digits.charAt(index) - '0')];
        // 下
        for (char c: letters.toCharArray()) {
    		combination(current + c, digits, index + 1, res);
    	}
    }
}