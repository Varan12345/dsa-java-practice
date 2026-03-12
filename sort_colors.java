public class sort_colors {
    public static void main(String[] args) {
        int []arr={2,0,2,1,1,0};
        int left=0;
        int right=arr.length-1;
        int i=0;
        while(i<=right){
            if(arr[i]==0){
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
                i++;
            }
            else if(arr[i]==2){
                int temp=arr[right];
                arr[right]=arr[i];
                arr[i]=temp;
                right--;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
