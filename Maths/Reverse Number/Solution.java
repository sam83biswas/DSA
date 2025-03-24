class Main {
    public static int revNum(int num){
        int newNum = 0;
        while(num>0){
            int rem = num%10;
            newNum = newNum*10 + rem;
            num /= 10;
        }
        return newNum;
    }
    public static void main(String[] args) {
        System.out.println(revNum(28912));
    }
}
