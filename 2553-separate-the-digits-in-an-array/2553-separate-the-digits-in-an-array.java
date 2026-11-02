class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int digit=nums[i];
            List<Integer> temp=new ArrayList<>();
            while(digit!=0){
                int num=digit % 10;
                temp.add(num);
                digit=digit/10;
            }

            for(int j=temp.size()-1;j>=0;j--){
                list.add(temp.get(j));
            }
        }
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}