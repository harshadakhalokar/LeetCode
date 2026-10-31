class Solution {
    public int averageValue(int[] nums) {
        int avg = 0;
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2==0 && nums[i] % 3==0){
                count++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2==0 && nums[i] % 3==0){
                sum = sum + nums[i];
            }
        }
        if(count>0){
            avg = sum/count;
        }
        
        return avg ;
    }
}