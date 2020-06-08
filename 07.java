	class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        
        for(int coin: coins){
            for(int k = coin;k < amount+1;k++){
                dp[k] = dp[k] + dp[k - coin];
            }
        }
        return dp[amount];
    }
}