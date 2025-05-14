class Solution {
    
    public static void changeArr(int[] arr,int idx,int val){
        if(idx == arr.length){
            print(arr);
            return;
        }
        arr[idx] = val;
        changeArr(arr,idx+1,val+1);
        arr[idx] = val-2;
    }
    
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr,0,1);
        print(arr);
    }
}
