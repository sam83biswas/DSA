class Solution {
    public int revNum(int x){
        int newNum = 0;

        while(x != 0){
            int dig = x%10;
            if(newNum > Integer.MAX_VALUE/10 || newNum < Integer.MIN_VALUE/10){
                return 0;
            }
            newNum = newNum*10 + dig;
            x /= 10;
        }

        return newNum;
    }
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        int val = revNum(x);
        return val == x;
        
    }
}
