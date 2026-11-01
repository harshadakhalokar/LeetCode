class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int num=nums[i];
            while(num!=0){
                int digit=num % 10;
                sum=sum+digit;
                num=num/10;
            }
            nums[i]=sum;
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}