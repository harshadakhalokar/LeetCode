class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum=0;
        int digit_sum=0;
        for(int i=0;i<nums.length;i++){
            element_sum=element_sum+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n!=0){
                int digit=n % 10;
                digit_sum=digit_sum + digit;
                n = n / 10;
            }
        }

        int ans=Math.abs(element_sum-digit_sum);

        return ans;
    }
}