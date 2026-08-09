class Solution {
    public int[] runningSum(int[] nums) {
        int[] running_array=new int[nums.length];
        for(int i=0;i<running_array.length;i++){
            running_array[i]=0;
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                running_array[i]=nums[i];
            }
            else{
                running_array[i]=running_array[i-1]+nums[i];
            }
        }
        return running_array;
    }
}