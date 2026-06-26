class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        int n = timeSeries.length;

        for (int i = 0; i < n; i++) {
            if (i == n - 1 || timeSeries[i + 1] >= timeSeries[i] + duration) {
                totalDuration += duration;
            } else {
                totalDuration += timeSeries[i + 1] - timeSeries[i];
            }
        }

        return totalDuration;
    }
}
