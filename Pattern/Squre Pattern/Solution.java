class Main {
    
    public static void sqrPtrn(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        sqrPtrn(5);
    }
}
