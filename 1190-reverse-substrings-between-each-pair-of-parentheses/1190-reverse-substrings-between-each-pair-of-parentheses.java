class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                String temp="";
                while(stack.peek()!='('){
                    temp=temp+stack.pop();
                }
                stack.pop();
                for(int j=0;j<temp.length();j++){
                    stack.push(temp.charAt(j));
                }
            }
            else{
                stack.push(ch);
            }
        }   
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        return ans; 
    }
}