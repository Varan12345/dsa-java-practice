public class move_zerestoend_arr {
    public static void main(String[] args) {
        int [] arr={1,0,-2,3,0,4,8,0,10,12};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }}
}
