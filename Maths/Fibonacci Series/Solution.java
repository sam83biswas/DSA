class Main {
    public static void fib(int num){
        int num1 = 0;
        int num2 = 1;
        
        for(int i = 0; i<=num; i++){
            if(i==0 || i==1){
                System.out.print(i + " ");
            }else{
                int num3 = num1+num2;
                num1 = num2;
                num2 = num3;
                System.out.print(num3 + " ");
            }
        }
    }
    public static void main(String[] args) {
        fib(10);
    }
}
