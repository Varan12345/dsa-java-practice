public class remove_duplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
       int n = arr.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        System.out.println("The array after removing duplicates is: ");
        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
