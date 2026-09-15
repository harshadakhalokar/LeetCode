class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int count_smaller=0;
        int count_target=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                count_smaller++;
            }

            if(nums[i]==target){
                count_target++;
            }
        }

        for(int i=0;i<count_target;i++){
            list.add(count_smaller);
            count_smaller++;
        }

        return list; 
    }
}