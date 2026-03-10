public class running {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sum=0;
        int [] arr1=new int[5];
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr1[i]=sum;

        }
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        //System.out.println("The sum of the array is: "+sum);
    }
}
