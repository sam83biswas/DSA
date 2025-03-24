class Solution {
    
    public static void trnglPtrn(int n){
        
       char ch = 'A';
       char chDplct = ch;
        for(int i = 0; i<n; i++){
            for(int j = i+1;j>0;j--){
                System.out.print(chDplct-- + " ");
            }
            ch++;
            chDplct = ch;
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        trnglPtrn(5);
    }
}
