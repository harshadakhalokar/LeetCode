class Solution {
    public int missingMultiple(int[] nums, int k) {
       
        for(int i=1;;i++){
            int val=k*i;
            boolean found=false;
            
            for(int j=0;j<nums.length;j++){
                if(val==nums[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                return val;
            }
        }
    }
}