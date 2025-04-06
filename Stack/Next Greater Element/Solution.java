class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stk = new Stack<>();
        int[] newArr = new int[arr.length];
        ArrayList<Integer> nxtGrtr = new ArrayList<>();
        
        for(int i = arr.length-1; i>=0; i--){
            while(!stk.isEmpty() && arr[i]>=arr[stk.peek()]){
                stk.pop();
            }
            if(stk.isEmpty()){
                newArr[i] = -1;
            }else{
                newArr[i] = arr[stk.peek()];
            }
            stk.push(i);
        }
        for(int i = 0;i<arr.length;i++){
            nxtGrtr.add(i,newArr[i]);
        }
        return nxtGrtr;
    }
}
