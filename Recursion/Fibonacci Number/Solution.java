class Solution {
    
    public static int fib(int num){
        if(num==0 || num==1){
            return num;
        }
        return fib(num-1) + fib(num-2);
    }
    
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
