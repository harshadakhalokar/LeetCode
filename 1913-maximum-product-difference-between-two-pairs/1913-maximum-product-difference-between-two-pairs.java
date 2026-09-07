class Solution {
    public int maxProductDifference(int[] nums) {
        int largest=nums[0];
        int secondlargest=Integer.MIN_VALUE;
        int smallest=nums[0];
        int secondsmallest=Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(largest<nums[i]){
                secondlargest=largest;
                largest=nums[i];
            }
            else if(secondlargest<nums[i]){
                secondlargest=nums[i];
            }
        }

        for(int i=1;i<nums.length;i++){
            if(smallest>nums[i]){
                secondsmallest=smallest;
                smallest=nums[i];
            }
            else if(secondsmallest>nums[i]){
                secondsmallest=nums[i];
            }
        }

        int multiplication=(largest*secondlargest)-(smallest*secondsmallest);
        return multiplication;
    }
}