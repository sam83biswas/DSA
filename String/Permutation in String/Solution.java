class Solution {

    public boolean isSame(int[] frq1, int[] frq2){
        for(int i = 0;i<26;i++){
            if(frq1[i] != frq2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {

        int frq[] = new int[26];

        for(int i = 0;i<s1.length();i++){
            frq[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i<s2.length(); i++){
            int windFrq[] = new int[26];
            int windIdx = 0;

            int idx = i;

            while(windIdx < s1.length() && idx < s2.length()){
                windFrq[s2.charAt(idx) - 'a']++;
                windIdx++; idx++;
            }

            if(isSame(frq,windFrq)){
                return true;
            }
        
        }
        return false;
    }
}
