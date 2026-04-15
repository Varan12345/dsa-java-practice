import java.util.HashMap;

public class hashmap_target {
    public static void main(String[] args) {

        int[] nums={2,7,11,15};
        int target=9;
         HashMap<Integer,Integer> map=new HashMap<>();
         

         for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int required=target-num;

            if(map.containsKey(required)){
                System.out.println(map.get(required)+""+i);
                break;
            }
            map.put(num,i);
         }
    }
}
