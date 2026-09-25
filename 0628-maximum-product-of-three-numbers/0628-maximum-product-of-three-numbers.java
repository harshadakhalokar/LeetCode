class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int multi1=0;
        int multi2=0;
        
        multi1=nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        multi2=nums[0] * nums[1] * nums[nums.length-1];

        if(multi1>multi2){
            return multi1;
        }
        else{
            return multi2;
        }    
       
    }
}