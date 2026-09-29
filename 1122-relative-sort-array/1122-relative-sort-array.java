class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans=new int[arr1.length];
        int k=0;
        List<Integer> remaining=new ArrayList<>(); 
        boolean[] used=new boolean[arr1.length];
        for(int i=0;i<arr2.length;i++){
            int num=arr2[i];
            int count=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==num){
                    used[j]=true;
                    count++;
                }
            }
            while(count>0){
                ans[k]=num;
                count--;
                k++;
            } 
        }
        for(int i=0;i<arr1.length;i++){
            if(!used[i]){
                remaining.add(arr1[i]);
            }
        } 
        Collections.sort(remaining);
        for(int nums:remaining){
            ans[k]=nums;
            k++;
        }
        return ans;
    }
}