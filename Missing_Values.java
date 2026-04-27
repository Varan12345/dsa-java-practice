public class Missing_Values {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4,}; // Example array with a missing value
        int n = arr.length;
        // int n = arr.length;
        // int totalSum = (n + 1) * (n + 2) / 2; // Sum of first n+1 natural numbers
        // int arrSum = 0;

        // for (int num : arr) {
        //     arrSum += num;
        // }

        // int missingValue = totalSum - arrSum;
        // System.out.println("The missing value is: " + missingValue);

       int xor=0;
       for(int i=0;i<=n;i++){
        xor^=i;
       }
         for(int num:arr){
          xor^=num;
         }
            System.out.println("The missing value is: " + xor);


    }
}
