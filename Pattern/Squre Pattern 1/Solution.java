class Solution {
    
    public static void sqrPtrn(int n){
        char ch = 'A';
        
        for(int i = 0; i<n; i++){
            for(int j = 0;j<n;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        sqrPtrn(3);
    }
}
