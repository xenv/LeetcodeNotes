/*
    问题链接：https://leetcode.com/problems/happy-number/
    难度系数 7
    终止条件很难想到借助 set 
*/
class Solution202 {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while(n != 1) {
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10; 
            } 
            if(!set.add(sum)){
                return false;
            }
            n = sum;
            sum = 0;
        }
        return true;
        
    }
   
}