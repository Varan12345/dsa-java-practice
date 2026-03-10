public class leadersarr {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int [] ans = new int[6];
        int j = 0;
        int curr_max = arr[arr.length-1];
        System.out.println("The leaders in the array are: ");

        for (int i=arr.length-1;i>=0;i--){
          if (arr[i]>curr_max){
              curr_max = arr[i];
              ans[j] = curr_max;
              j++;
           }
        }
        for(int k=j-1;k>=0;k--){
            System.out.print(ans[k]+" ");
        }


        // for (int i = 0; i < arr.length; i++) {
        //     boolean isLeader = true;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //    for (int j=i+1;j<arr.length;j++){
        //         if (arr[i] < arr[j]){
        //             isLeader = false;
        //             break;
        //         }
        //     }
        //     if (isLeader) {
        //         System.out.print(arr[i] + " ");
 



            
            
        }
    }           

