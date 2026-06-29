class Solution {
    public String[] relativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] sorted = score.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            int rank = n - Arrays.binarySearch(sorted, score[i]);
            switch (rank) {
                case 1:
                    result[i] = "Gold Medal";
                    break;
                case 2:
                    result[i] = "Silver Medal";
                    break;
                case 3:
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = String.valueOf(rank);
            }
        }
//
        return result;
    }
}
