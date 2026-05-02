class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        int maxLen=0;

        for(int i=0;i<n;i++){
            int count=0;
            boolean found=false;

            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;

                }
                if(nums[j]==nums[i]+1){
                    count++;
                    found =true;
                }
            }
                if(found){
                    maxLen=Math.max( maxLen,count);
                }
            }

            return maxLen;

        }
    }

