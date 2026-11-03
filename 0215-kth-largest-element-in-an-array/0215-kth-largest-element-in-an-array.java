class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int largest=0;
        while(k>0){
            largest=nums[i];
            i--;
            k--;
        }

        return largest;
    }
}