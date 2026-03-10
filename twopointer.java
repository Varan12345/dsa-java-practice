public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;
        int flag=0; 
        int target = 6;
        System.out.println("The elements of the array are: ");
        while (left < right) {
            int sum = arr[left] + arr[right];
          
            if (sum == target) {
                System.out.println("The pair is: " + arr[left] + " and " + arr[right]);
                 flag=1;
                left++;
                right--;
            

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
            if (flag==1){
                System.out.println("pair found");

            }else{
                System.out.println("pair not found");
            }
           
        }
  }
    

