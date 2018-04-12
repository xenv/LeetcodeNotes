/* 
    问题链接：https://leetcode.com/problems/coin-change/
    难度系数 8
    时间复杂度 O(n * amount)
   
*/

class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        // init
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        // dp
        for (int i = 0; i < coins.length; i++ ){
            for (int j = coins[i]; j <= amount; j++) {
                // 使用 coins[i]
                int spare = j - coins[i];
                // 剩余钱币的最优解
                int spareRes = memo[spare];
                //System.out.println("i = " + i + ",j=" + j + ",spareRes = " + spareRes);
                // 剩余钱币无解
                if (spareRes != Integer.MAX_VALUE) {
                    memo[j] = Math.min(memo[j], spareRes + 1);
                }
            }
        }
        //System.out.println(Arrays.toString(memo));
        return memo[amount] == Integer.MAX_VALUE ? -1 : memo[amount];
    }
}