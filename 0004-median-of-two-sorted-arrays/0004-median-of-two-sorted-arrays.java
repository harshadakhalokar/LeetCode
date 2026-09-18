class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }

        while(i<nums1.length){
            ans[k]=nums1[i];
            k++;
            i++;
        }

        while(j<nums2.length){
            ans[k]=nums2[j];
            k++;
            j++;
        }

        int sum=0;
        for(int x=0;x<ans.length;x++){
            sum=sum+ans[x];
        }

        double avg=0;
        if(ans.length%2!=0){
            avg=ans[ans.length/2];
        }
        else{
            avg=(ans[ans.length/2-1]+ans[ans.length/2])/2.0;
        }

        return avg;
    }
}