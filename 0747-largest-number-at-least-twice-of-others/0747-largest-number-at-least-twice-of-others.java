class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                second_max=max;
                max=nums[i];
                index=i;
                
            }
            else if(nums[i]>second_max){
                second_max=nums[i];
            }
        } 

        if(max>=2*second_max){
            return index;
        }  
        return -1;
    }
}