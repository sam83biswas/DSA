class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int end = 0;
        int len = s.length();
        int strLen = 0;

        int ans[] = new int[256];
        Arrays.fill(ans,0);

        while(end < len){
            if(ans[s.charAt(end)] == 0){
                ans[s.charAt(end)]++;
                end++;
                strLen = Math.max(strLen,end-st);
            }else{
                ans[s.charAt(st)]--;
                st++;
            }
        }
        return strLen;
        
    }
}
