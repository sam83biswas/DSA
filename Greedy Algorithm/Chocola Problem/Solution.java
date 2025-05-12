import java.util.*;
class Solution {
    
    public static void main(String[] args) {
        Integer[] horCost = {4,1,2};
        Integer[] verCost = {2,1,3,1,4};
        
        int h = 0, v = 0;
        int cost = 0;
        int hp = 1, vp = 1;
        
        Arrays.sort(horCost, Collections.reverseOrder());
        Arrays.sort(verCost, Collections.reverseOrder());
        
        while(h<horCost.length && v<verCost.length){
            if(horCost[h] >= verCost[v]){
                cost += horCost[h]*vp;
                h++;
                hp++;
            }else{
                cost += verCost[v]*hp;
                v++;
                vp++;
            }
        }
        
        while(h<horCost.length){
            cost += horCost[h]*vp;
            h++;
            hp++;
        }
        
        while(v<verCost.length){
            cost += verCost[v]*hp;
            v++;
            vp++;
        }
        
        System.out.print(cost);
    }
}
