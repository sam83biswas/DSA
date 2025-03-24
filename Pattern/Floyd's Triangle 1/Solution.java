class Solution {
    
    public static void trnglPtrn(int n){
        
       char ch = 'A';
        for(int i = 0; i<n; i++){
            for(int j = 0;j<i;j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        trnglPtrn(5);
    }
}
