class Solution {
    public static void trnglPtrn(int n){
        int num = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0;j<i;j++){
                System.out.print(++num + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        trnglPtrn(5);
    }
}
