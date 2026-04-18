
public class count_subarray {
    public static void main(String[] args){
        int arr[] = {5,7,6,7,4};
        int x = 20;
        int k = 3;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum==x){
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            if (sum==x){
                count++;
            }
        }
        System.out.println("The count of subarrays of size k with sum x is: " + count);
        System.System.out.println();
    }
}

