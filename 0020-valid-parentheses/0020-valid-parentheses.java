class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()){
                    return false;
                }

                char open = st.peek();

                if((open == '(' && ch != ')') ||
                    (open == '{' && ch != '}') ||
                    (open == '[' && ch != ']')
                ){
                    return false;
                }

                st.pop();
            }

        }

        if(st.size() != 0){
            return false;
        }

        return true;
    }
}