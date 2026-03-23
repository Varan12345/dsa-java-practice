public class maximum_subarray_sum {
    public static void main(String[] args) {
        int []arr={5,4,-1,7,8};
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            } 
        }
        System.out.println(max_sum);
    }
}
      
           
        
