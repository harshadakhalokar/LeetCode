class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total_length=nums1.length+nums2.length;

        if(nums1.length>nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }

        int left=0;
        int right=nums1.length;
        
        while(left<=right){
            int partition1=(left+(right-left)/2);
            int partition2=(total_length+1)/2-partition1;

            int left1=(partition1==0) ? Integer.MIN_VALUE : nums1[partition1-1];
            int right1=(partition1==nums1.length) ? Integer.MAX_VALUE : nums1[partition1];

            int left2=(partition2==0) ? Integer.MIN_VALUE: nums2[partition2-1];
            int right2=(partition2==nums2.length) ? Integer.MAX_VALUE : nums2[partition2];

            if(left1<=right2 && left2<=right1){
                if(total_length%2 != 0){
                    double median=Math.max(left1,left2);
                    return median;
                }
                else{
                    double median=(Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                    return median;
                }
            }
            else if(left1>right2){
                right=partition1-1;
            }
            else if(left2>right1){
                left=partition1+1;
            }
        }
        return -1;
    }
}