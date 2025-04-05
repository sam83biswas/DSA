class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        int i = 0;

        while(i<s.length()){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
                i++;
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                if((s.charAt(i) == ')' && stk.peek() == '(')
                || (s.charAt(i) == '}' && stk.peek() == '{')
                || (s.charAt(i) == ']' && stk.peek() == '[')){
                    stk.pop();
                    i++;
                }else{
                    return false;
                }
                
            }
        }

        return stk.isEmpty() ? true : false; 
    }
}
