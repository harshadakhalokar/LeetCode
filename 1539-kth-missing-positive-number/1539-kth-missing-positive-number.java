class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int j=1;
        int missing=0;
        int ans=0;
        while(missing<k){
            if(!set.contains(j)){
                ans=j;
                missing++;
            }
            j++;
        }
        return ans;
    }
}