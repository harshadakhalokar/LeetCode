class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        
        int n=nums.length;
        int[] ans=new int[nums.length];

        for(int i=0;i<2*nums.length;i++){
            int index=i%n;
            int current=nums[index];
            while(!stack.isEmpty() && nums[stack.peek()]<current){
                ans[stack.peek()]=current;
                stack.pop();
            }

            if(i<n){
                stack.push(index);
            }
        }

        while(!stack.isEmpty()){
            ans[stack.peek()]=-1;
            stack.pop();
        }

        return ans;
    }
}