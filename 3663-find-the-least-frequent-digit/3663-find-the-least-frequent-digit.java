class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int digit = n % 10;
            if(map.containsKey(digit)){
                map.put(digit,map.get(digit)+1);
            }
            else{
                map.put(digit,1);
            }
            n = n / 10;
        }

        int min=Integer.MAX_VALUE;
        int ans=0;

        for(int key:map.keySet()){
            if(map.get(key)<min || (map.get(key)==min && key<ans)){
                min=map.get(key);
                ans=key;
            }
        }
        return ans;
    }
}