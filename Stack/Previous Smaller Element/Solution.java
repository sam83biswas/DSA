import java.util.*;
class Solution {
    public static void prvSmaller(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++){
            while( !stk.isEmpty() 
            && arr[stk.peek()] >= arr[i] ){
                stk.pop();
            }
            
            if(stk.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = arr[stk.peek()];
            }
            
            stk.push(i);
        }
        
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,0,8,6};
        prvSmaller(arr);
    }
}
