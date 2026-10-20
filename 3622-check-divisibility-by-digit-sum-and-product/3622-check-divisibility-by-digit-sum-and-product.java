class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int multi=1;
        int current=n;
        while(current > 0){
            int num=current % 10;
            sum = sum + num;
            multi = multi * num;
            current = current / 10;
        }

        return n % ( sum + multi )== 0;
    }
}