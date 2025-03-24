class Solution {

    // Iterative approach
    // public static int gcd(int a, int b){
    //     while(a>0 && b>0){
    //         if(a>b){
    //             a = a%b;
    //         }else{
    //             b = b%a;
    //         }
    //     }
        
    //     if(a==0){
    //         return b;
    //     }
    //     return a;
    // }

  // Recursive approach
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(6,14));
    }
}
