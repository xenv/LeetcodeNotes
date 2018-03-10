/*
    问题链接：https://leetcode.com/problems/valid-anagram/
    难度系数 3
    时间复杂度 O(n) 空间 O(n) ，用 HashMap 效率并不高，直接开 int[26] 即可
*/
class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        // 开空间
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        // 读取 s 到 map
        for (Character c : s.toCharArray()) {
            map.merge(c, 1, (a, b) -> a + b);
        }
        for (Character c : t.toCharArray()) {
            Integer oldInt = map.get(c);
            if (oldInt == null || oldInt == 0) {
                return false;
            } else {
                map.put(c, oldInt - 1);
                count++;
            }
        }
        return count == s.length();
    }
}