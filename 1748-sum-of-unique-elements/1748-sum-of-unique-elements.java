class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashSet<Integer> unique=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!unique.contains(nums[i]) && !duplicate.contains(nums[i])){
                unique.add(nums[i]);
            }
            else{
                unique.remove(nums[i]);
                duplicate.add(nums[i]);
            }
        }

        for(int num:unique){
            sum=sum+num;
        }
        return sum;
    }
}