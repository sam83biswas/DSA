class Solution {
    
    public static void sqrPtrn(int n){
        for(int i = 0; i<n; i++){
            char ch = 'A';
            for(int j = 0; j<n; j++){
                System.out.print(ch + " ");
                ch += 1;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        sqrPtrn(5);
    }
}
