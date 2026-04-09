class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char recent = st.pop();

                if((ch == ')' && recent != '(') || (ch == '}' && recent != '{') || (ch == ']' && recent != '[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

