class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int max_val=nums[0];

            for(int j=0;j<=i;j++){
                max_val=Math.max(max_val,nums[j]);
            }

            int min_val=nums[i];
            for(int j=i;j<nums.length;j++){
                min_val=Math.min(min_val,nums[j]);
            }

            if(max_val-min_val<=k){
                return i;
            }
        }
        return -1;
    }
}