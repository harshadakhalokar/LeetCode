class Solution {
    public int maxProduct(String[] words) {
        int[] masks=new int[words.length];

        for(int i=0;i<words.length;i++){
            String word=words[i];
            int mask=0;
            for(int j=0;j<word.length();j++){
                mask |= 1 << (word.charAt(j)-'a');
            }
            masks[i]=mask;
        }
        int max_product=0;
        for(int i=0;i<words.length;i++){
            int product=0;
            for(int j=i+1;j<words.length;j++){
                if((masks[i] & masks[j])==0){
                    product=(words[i].length()) * (words[j].length());    
                    
                    if(max_product<product){
                        max_product=product;
                    }
                }

            }
        }
        return max_product;
    }
}