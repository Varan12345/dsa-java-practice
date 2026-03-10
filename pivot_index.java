public class pivot_index {
    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 6, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int left_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (left_sum == sum - left_sum - arr[i]) {
                System.out.println("The pivot index is: " + i);
                return;
            }
            left_sum += arr[i];
        }
        System.out.println("There is no pivot index.");
    }
}