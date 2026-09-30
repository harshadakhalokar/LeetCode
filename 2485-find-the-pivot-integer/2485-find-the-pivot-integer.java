class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int sum_b=0;
        
        for(int i=1;i<=n;i++){
            sum_b=sum_b+i;
            int sum_a=0;
            for(int j=i;j<=n;j++){    
                sum_a=sum_a+j;  
            }
            if(sum_a==sum_b){
                return i;
            }
        }
        return -1;
    }
}