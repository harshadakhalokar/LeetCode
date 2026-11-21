class Solution {
    public boolean halvesAreAlike(String s) {
        String a = "";
        String b = "";
        for(int i=0;i<s.length()/2;i++){
            a+=s.charAt(i);
        }

        for(int i=s.length()/2 ; i<s.length() ; i++){
            b+=s.charAt(i);
        }

        String v="AEIOUaeiou";
        int a_count=0;
        int b_count=0;

        for(int i=0;i<a.length();i++){
            if(v.contains(String.valueOf(a.charAt(i)))){
                a_count++;
            }
        }

        for(int i=0;i<b.length();i++){
            if(v.contains(String.valueOf(b.charAt(i)))){
                b_count++;
            }
        }

        if(a_count==b_count){
            return true;
        }

        return false;
    }
}