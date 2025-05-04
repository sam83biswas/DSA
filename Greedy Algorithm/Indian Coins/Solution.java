import java.util.*;
class Solution {
    public static void main(String[] args) {
       Integer[] coins = {1,2,5,10,20,50,100,500,2000};
       
       Arrays.sort(coins,Comparator.reverseOrder());
       ArrayList<Integer> ans = new ArrayList<>();
       
       int target = 590;
       int cnt = 0;
       
       for(int i = 0; i<coins.length; i++){
           if(target >= coins[i]){
               while(target >= coins[i]){
                   target -= coins[i];
                   cnt++;
                   ans.add(coins[i]);
               }
           }
       }
       System.out.println(cnt);
       for(int i = 0; i<ans.size();i++){
           System.out.print(ans.get(i) + " ");
       }
    }
}
