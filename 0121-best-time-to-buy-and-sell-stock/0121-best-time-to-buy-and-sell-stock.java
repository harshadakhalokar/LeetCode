class Solution {
    public int maxProfit(int[] prices) {
        int smallest=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(smallest>prices[i]){
                smallest=prices[i];
            }
            if(maxprofit<(prices[i]-smallest)){
                maxprofit=(prices[i]-smallest);
            }
        }
        if(maxprofit>0){
            return maxprofit;
        }
        else{
            return 0;
        }
        
    }
}