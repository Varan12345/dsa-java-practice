//WAP which will take an array a i/p from the user and move all the zeeoes of the array to to the rigth side of the array
public class moving_zeroes {
    public static void main(String[] args) {
        int []arr={1,0,2,7,0,0,4,5};
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
           
        }
        while(k<arr.length){
            arr[k++]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
