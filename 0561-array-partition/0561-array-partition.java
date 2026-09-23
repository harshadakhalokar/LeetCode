class Solution {
    public int arrayPairSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            list.add(Arrays.asList(nums[i],nums[i+1]));
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i).get(0);
        }
        return sum;
    }
}