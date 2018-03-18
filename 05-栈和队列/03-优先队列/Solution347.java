/* 
    问题链接：https://leetcode.com/problems/top-k-frequent-elements
    难度系数 5
    时间复杂度 O(n) 空间 O(h)
   
*/
    
class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> (b.getValue()-a.getValue()));
        pq.addAll(map.entrySet());
        List<Integer> res = new ArrayList<>();
        
        while(res.size()<k){
            res.add(pq.poll().getKey());
        }

        return res;
    }
}