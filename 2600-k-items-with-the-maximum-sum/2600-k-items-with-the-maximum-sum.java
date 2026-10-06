class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int max_sum=0;
        while(k>0){
            if(numOnes>0){
                max_sum+=1;
                numOnes--;
                k--;
            }
            else if(numZeros>0){
                max_sum+=0;
                numZeros--;
                k--;
            }
            else{
                max_sum-=1;
                numNegOnes--;
                k--;
            }
        }
        return max_sum;
    }
}