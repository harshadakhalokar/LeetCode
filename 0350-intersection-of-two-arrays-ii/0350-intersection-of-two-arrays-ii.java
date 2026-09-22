class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
       
        if(nums1.length<=nums2.length){
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        list.add(nums1[i]);
                        nums1[i]=nums2[j]=-1;
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0;i<nums2.length;i++){
                for(int j=0;j<nums1.length;j++){
                    if(nums2[i]==nums1[j]){
                        list.add(nums1[j]);
                        nums1[j]=nums2[i]=-1;
                        break;
                    }
                }
            }
        }

        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}