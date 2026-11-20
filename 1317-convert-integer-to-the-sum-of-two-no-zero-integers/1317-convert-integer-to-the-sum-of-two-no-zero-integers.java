class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1;
        int b = n-1;

        while(a <= b){
            if(hasZero(a) || hasZero(b)){
                a++;
                b--;
            }else{
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }

    Boolean hasZero(int num){
        while(num>0){
            if(num%10==0){
                return true;
            }
            num/=10;
        }
        return false;
    }
}