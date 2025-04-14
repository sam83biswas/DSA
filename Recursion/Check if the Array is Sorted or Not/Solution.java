class Solution {
    
    public static boolean isSorted(int[] arr, int idx){
        if(idx==arr.length){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,5,8,0};
        System.out.println(isSorted(arr,0));
    }
}
