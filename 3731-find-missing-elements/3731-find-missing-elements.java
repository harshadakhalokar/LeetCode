class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest=nums[0];
        int largest=nums[0];

        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest=nums[i];
            }
            if(largest<nums[i]){
                largest=nums[i];
            }
        }

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        List<Integer>answer=new ArrayList<>();

        for(int i=smallest;i<=largest;i++){
            if(!set.contains(i)){
                answer.add(i);
            }
        }
        return answer;

    }
}