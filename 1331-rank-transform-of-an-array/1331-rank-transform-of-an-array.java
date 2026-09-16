class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans=new int[arr.length];
        int rank=1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i];
        }

        Arrays.sort(ans);

        for(int i=0;i<ans.length;i++){
            if(!(map.containsKey(ans[i]))){
                map.put(ans[i],rank);
                rank++;
            };
            

        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
    }
}