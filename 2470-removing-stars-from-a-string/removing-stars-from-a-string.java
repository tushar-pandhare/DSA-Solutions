class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(Character c: s.toCharArray()){
            if(c=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb;
            sb=new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
        return sb.reverse().toString();
    }
}