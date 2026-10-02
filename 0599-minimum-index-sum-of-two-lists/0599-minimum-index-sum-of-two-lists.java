class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        HashMap<String,Integer> sumMap=new HashMap<>();
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int i=map.get(list2[j]);
                sum=i+j;
                sumMap.put(list2[j],sum);
                if(sum<min){
                    min=sum;
                }
            }
        }
        List<String> list=new ArrayList<>();
        for(String key:sumMap.keySet()){
            if(sumMap.get(key)==min){
                list.add(key);
            }
        }
        
        return list.toArray(new String[0]);
    }
}