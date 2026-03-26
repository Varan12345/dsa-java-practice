
import java.util.*;
public class sorting_arr{
    public static void main(String[] args) {
        int []arr={1,4,5,6,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]<arr[i+1]){
                System.out.println("arr is sorted" );
             }
             else{
                System.out.println("arr is not sorted");
             }
    }}
}