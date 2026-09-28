class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
           
            if(num==0 && i==arr.length-1){
                return;
            }
            else if(num==0){         
                int j=arr.length-1;
                while(j>i+1){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[i+1]=0;
                i++;
            }
        }
        
    }
}