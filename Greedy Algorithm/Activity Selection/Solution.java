import java.util.*;
class Solution {
    
    public static void main(String[] args) {
        int[] st = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        
        int maxAct = 0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(0);
        
        int lastEnd = end[0];
        
        for(int i = 1; i<st.length; i++){
            if(st[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        
        System.out.println("MAX ACTIVITIES : " + maxAct);
        
        for(int i = 0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
