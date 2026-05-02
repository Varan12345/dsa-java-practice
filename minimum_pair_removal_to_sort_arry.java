package dsa;

public class minimum_pair_removal_to_sort_arry {
    int count = 0;
    public int minPairRemovals(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        return count;
    }
}
