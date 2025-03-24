class Solution {
    public int reverse(int x) {

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
}
