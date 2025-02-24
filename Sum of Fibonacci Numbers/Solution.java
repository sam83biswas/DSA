class Main {
    public static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    
    public static int fibSum(int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += fib(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fibSum(4));
    }
}
