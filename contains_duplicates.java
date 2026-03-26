import java.util.*;
public class contains_duplicates {
    public static void main(String[] args) 
    {
        int []nums={1,2,3};
        Arrays.sort(nums);
        boolean found=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                found=true;
                break; 
       
            }
       
        }
 System.out.println(found);
    }
}
