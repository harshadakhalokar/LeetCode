class Solution {
    public void duplicateZeros(int[] arr) {
        int count_zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count_zero++;
            }
        }

        int[] nums=new int[arr.length+count_zero];
        int j=nums.length-1;
        int k=arr.length-1;
        while(j>=0 && k>=0){
            if(arr[k]==0){
                nums[j]=0;
                nums[j-1]=0;
                j--;
                j--;
                k--;
            }else{
                nums[j]=arr[k];
                j--;
                k--;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
    }
}