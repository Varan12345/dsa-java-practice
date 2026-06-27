class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        
        // Initialize the dp array with the last row of the triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }
        
        // Start from the second last row and move upwards
        for (int layer = n - 2; layer >= 0; layer--) {
            for (int i = 0; i <= layer; i++) {
                dp[i] = Math.min(dp[i], dp[i + 1]) + triangle.get(layer).get(i);
            }
        }
        
        return dp[0];
    }
}
