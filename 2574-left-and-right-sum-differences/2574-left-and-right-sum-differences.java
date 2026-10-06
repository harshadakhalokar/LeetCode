class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];

        for(int i=1;i<nums.length;i++){
            leftSum[0]=0;
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }

        for(int i=rightSum.length-2;i>=0;i--){
            rightSum[rightSum.length-1]=0;
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }

        int k=0;
        while(k<ans.length){
            ans[k]=Math.abs(leftSum[k]-rightSum[k]);
            k++;
        }

        return ans;
    }
}