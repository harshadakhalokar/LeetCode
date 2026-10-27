class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                boolean found=false;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==-nums[i]){
                        found=true;
                        break;
                    }
                }
                if(found){
                    max=Math.max(max,nums[i]);
                }
            }
        }
        return max;
    }
}