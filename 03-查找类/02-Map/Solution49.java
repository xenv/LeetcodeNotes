/* 
    问题链接：https://leetcode.com/problems/group-anagrams/
    难度系数 5
    
*/
class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String sSorted = String.valueOf(cs);
            if(map.get(sSorted) == null) {
                map.put(sSorted,new ArrayList<>());
            }
            map.get(sSorted).add(s);
        }
        List<List<String>>result= new ArrayList<>();
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            List<String> values = e.getValue();
            //Collections.sort(values); 
            result.add(values);
        }
        return result;
    }
}