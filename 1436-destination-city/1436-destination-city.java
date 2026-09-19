class Solution {
    public String destCity(List<List<String>> paths) {
        String ans="";
        HashSet<String> set_from=new HashSet<>();
        HashSet<String> set_to=new HashSet<>();
        for(int i=0;i<paths.size();i++){
            set_from.add(paths.get(i).get(0));
            set_to.add(paths.get(i).get(1));
        }

        for(String city:set_to){
            if(!set_from.contains(city)){
                return city;
            }
        }
        return  null;
    }
}