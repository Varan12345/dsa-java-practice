public class sliding_window {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int j = 0;

        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int l = i; l < i + k; l++) {
                max = Math.max(max, arr[l]);
            }
            ans[j++] = max;
        }

        System.out.println("The maximum elements in each sliding window are: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
            System.out.println();
        }
    }

}