class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ans[0]=nums[i];
                }
            }
        }

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}