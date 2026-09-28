class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=0;
        if(arr.length>=1){
            diff=Math.abs(arr[1]-arr[0]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(diff!=Math.abs(arr[i]-arr[i+1])){
                return false;
            }
        }
        return true;
    }
}