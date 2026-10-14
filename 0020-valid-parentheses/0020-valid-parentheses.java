class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()){
                    return false;
                }

                char top = st.peek();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna