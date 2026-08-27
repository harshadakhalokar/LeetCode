class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum=Integer.MIN_VALUE;
        List<Boolean>ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(maximum<candies[i]){
                maximum=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maximum){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}