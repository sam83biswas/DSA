class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> stockSpan = new ArrayList<>();
        
        for(int i = 0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i] >= arr[stk.peek()]){
                stk.pop();
            }
            
            if(stk.isEmpty()){
                stockSpan.add(i,i+1);
            }else{
                stockSpan.add(i,i-stk.peek());
            }
            
            stk.push(i);
            
        }
        return stockSpan;
    }
}
