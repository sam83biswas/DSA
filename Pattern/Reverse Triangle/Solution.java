class Solution {
    
    public static void trnglPtrn(int n){
        
        for(int i = 0; i<n; i++){
            
            for(int j = i+1;j>0;j--){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        trnglPtrn(5);
    }
}
