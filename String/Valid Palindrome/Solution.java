class Solution {
    public boolean isAlpha(char ch){
        if((ch>='0' && ch<='9') || 
        (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length()-1;

        while(st<end){
            while(st<end && !isAlpha(s.charAt(st))){
                st++;
                continue;
            }

            while(st<end && !isAlpha(s.charAt(end))){
                end--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }

            st++;
            end--;
        }

        return true;
        
    }
}
