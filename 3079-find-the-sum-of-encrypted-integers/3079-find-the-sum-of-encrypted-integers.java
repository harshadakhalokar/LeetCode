class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int maxDigit=0;
            int digits=0;

            while(num>0){
                int digit=num%10;
                if(digit>maxDigit){
                    maxDigit=digit;
                }
                digits++;
                num=num/10;   
            }

            int encrypted=0;
            while(digits>0){
                encrypted=encrypted*10+maxDigit;
                digits--;
            }
            sum=sum+encrypted;
        }
        return sum;
    }
}