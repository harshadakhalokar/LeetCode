class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        int i=nums.length-1;
        int[] ans=new int[k];
        int size=0;
        
        while(i>=0 && k>size){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                ans[size]=nums[i];
                size++;
            }
            i--;
        }
        
        return Arrays.copyOf(ans,size);
    }
}