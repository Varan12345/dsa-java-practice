//wap which will print the  eveno  and non negative numbers to the left side of a arr
public class left_eveno {
    public static void main(String[] args) {
     

        int[] arr = {2,8,0,-1,-2,4,3};
        int left = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] >= 0 && arr[i] % 2 == 0){

                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;

                left++;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
        

