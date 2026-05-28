class Solution{
    public int firstStableIndex(int []nums,int k){
        int n=nums.length;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>=k){
                return i;
            }
        }

        return -1;
       // System.out.println();
    }
    }