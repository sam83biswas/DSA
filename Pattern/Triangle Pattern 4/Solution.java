class Solution {
    
    public static void trnglPtrn(int n){
        
        for(int i = 0; i<n; i++){
            int num = 0;
            for(int j = 0;j<i+1;j++){
                System.out.print(++num + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        trnglPtrn(5);
    }
}
