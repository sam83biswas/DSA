class Solution {
    
    public static int pos(int[] arr, int idx, int key){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        }
        return pos(arr,idx+1,key);
    }
    
    
    public static void main(String[] args) {
        int[] arr={1,8,0,2,5,8,0};
        System.out.println(pos(arr,0,0));
        
    }
}
