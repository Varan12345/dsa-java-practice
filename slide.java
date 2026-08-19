public class slide {
    public static void main(String[] args){
int arr[] = {1, 2, 3, 4, 5,7,10};
int k = 4;
int sum = 0;
for (int i=0;i<k;i++){
    sum+=arr[i];

}
int max_sum = sum;
for (int i=k;i<arr.length-1;i++){
    sum+=arr[i];
    sum-=arr[i-k];
    if (sum>max_sum){
        max_sum = sum;
    }}
System.out.println("The maximum sum of a subarray of size k is: "+max_sum);
    }}