class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int target=nums[i+1];
                if(map.containsKey(target)){
                    map.put(target,map.get(target)+1);
                }
                else{
                    map.put(target,1);
                }
            }
        }
        int max=0;
        int ans=0;
        for(int k:map.keySet()){
            if(map.get(k)>max){
                max=map.get(k);
                ans=k;
            }
        }
        return ans;
    }
}