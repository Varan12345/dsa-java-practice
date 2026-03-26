import java.util.*;
public class merge_sorted_arr{
    public static void main(String[] args) {
        int [] nums1={1,2,3,0,0,0};
        int n=3;
        int [] nums2={2,5,6};
        int m=3;
        int [] temp=new int[n+m];
        for(int i=0 ;i<n;i++){
           
                temp[i]=nums1[i];
                
            }
            for(int i=0;i<m;i++){
                temp[n+i]=nums2[i];
                
            }

            Arrays.sort(temp);
            
         System.out.println(Arrays.toString(temp));
            
    }
}