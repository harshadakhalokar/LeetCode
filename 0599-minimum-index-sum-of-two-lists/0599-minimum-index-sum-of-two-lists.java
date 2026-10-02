class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            String s=list1[i];
            for(int j=0;j<list2.length;j++){
                if(s.equals(list2[j])){
                    int sum=i+j;
                    map.put(s,sum);
                    if(sum<min){
                        min=sum;
                    }
                }
            }
        }
        List<String> list=new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==min){
                list.add(key);
            }
        }
        
        return list.toArray(new String[0]);
    }
}