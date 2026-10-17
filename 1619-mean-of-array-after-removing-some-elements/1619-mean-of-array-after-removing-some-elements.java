class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        int count=arr.length/20;

        for(int i=count;i<arr.length-count;i++){
            sum=sum+arr[i];
        }

        return (double) sum / (arr.length-2*count);
    }
}