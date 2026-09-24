class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=0){
                String n=String.valueOf(nums[i]);
                int s=0;
                for(int j=0;j<n.length();j++){
                    s=s+n.charAt(j)-'0';
                }

                int digitsum=s;

                if(digitsum==i){
                    return i;
                }
            }
        }
        return -1;
    }
}