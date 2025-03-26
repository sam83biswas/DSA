import java.util.*;
class Solution {
    
    public static ArrayList<Integer> pairSum(int[] arr, int trgt){
        int i = 0;
        int j = arr.length-1;
        int sum = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        
        while(i<j){
            sum = arr[i] + arr[j];
            if(sum>trgt){
                j--;
            }else if(sum<trgt){
                i++;
            }else if(sum == trgt){
                ar.add(i);
                ar.add(j);
                return ar;
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int arr[] = {3,7,12,18};
        System.out.println(pairSum(arr,15));
    }
}
