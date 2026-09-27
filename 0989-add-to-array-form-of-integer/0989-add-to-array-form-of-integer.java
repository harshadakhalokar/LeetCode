class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int carry=0;
        int i=num.length-1;
        int sum=0;
        while(i>=0 || k>0 || carry>0){
            int numDigit=0;
            if(i>=0){
                numDigit=num[i];
            }

            sum=numDigit+(k%10)+carry;

            int digit=sum%10;
            carry=sum/10;

            list.add(0,digit);

            i--;
            k=k/10;
        }
        return list;
    }
}