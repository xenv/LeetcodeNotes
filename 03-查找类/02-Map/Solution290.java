/* 
    问题链接：https://leetcode.com/problems/word-pattern
    难度系数 7
    时间复杂度 O(n) 空间 O(n)
*/
class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null ){
            throw new IllegalArgumentException();
        }
        String[] list = str.split(" ");
        if (pattern.length() != list.length) {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        char[] patternChar = pattern.toCharArray();
        for (int i = 0; i < patternChar.length ; i++) {
            if (map.get(patternChar[i]) == null && !set.contains(list[i])) {
                map.put(patternChar[i], list[i]);
                set.add(list[i]);
            } else if (map.get(patternChar[i])==null || !map.get(patternChar[i]).equals(list[i])) {
                return false;
            }
        }
        return true;
    }
}