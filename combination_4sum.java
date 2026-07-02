class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }
    private int combinationSum4Helper(int[] nums, int target, int[] memo) {
        if (target < 0) {
            return 0;
        }
        if (target == 0) {
            return 1;
        }
        if (memo[target] != -1) {
            return memo[target];
        }

        int count = 0;
        for (int num : nums) {
            count += combinationSum4Helper(nums, target - num, memo);
        }

        memo[target] = count;
        return count;
    }
}
