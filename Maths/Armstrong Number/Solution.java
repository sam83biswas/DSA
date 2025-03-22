import java.util.*;

class Solution {
    
    public static boolean isArmstrong(int num){
        int copyNum = num;
        
        int sum = 0;
        
        while(num != 0){
            int digit = num%10;
            sum += digit*digit*digit;
            num /= 10;
        }
        
        return sum == copyNum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(156));
    }
}
