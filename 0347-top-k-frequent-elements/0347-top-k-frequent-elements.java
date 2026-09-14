class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(map.containsKey(nums[i])){
                count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int count=0;count<k;count++){
            int max_frequency=0;
            int max_element=0;
        
            for(int num:map.keySet()){
                if(map.get(num)>max_frequency){
                    max_frequency=map.get(num);
                    max_element=num;
                }
            }    
            ans[count]=max_element;
            map.remove(max_element);     
        }
        return ans;
    }
}