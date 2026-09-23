class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }

        int target=total-x;

        if(target < 0){
            return -1;
        }
        if(target==0){
            return nums.length;
        }
        int sum=0;
        int length=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>target){
                sum=sum-nums[left];
                left++;
            }

            if(sum==target){
                length=Math.max(length,right-left+1);
            }

        }
        if(length==0){
            return -1;
        }
        int ans=nums.length-length;
        return ans;
    }
}