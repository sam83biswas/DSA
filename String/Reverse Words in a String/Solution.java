class Solution {
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder(s);
        str = str.reverse();

        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i<s.length();i++){
            StringBuilder word = new StringBuilder();
            while(i<s.length() && str.charAt(i) != ' '){
                word.append(str.charAt(i));
                i++;
            }
            if(word.length()>0){
                newStr.append(' ');
                newStr.append(word.reverse());
            }
        }
        return newStr.toString().trim();
    }
}
