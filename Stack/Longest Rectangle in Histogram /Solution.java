class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxArea = 0;
        int currArea;
        
        int[] lh = new int[n];
        int[] rh = new int[n];


        Stack<Integer> stk = new Stack<>();

        //next smaller
        for(int i = n-1 ; i>= 0; i--){
            while(!stk.isEmpty() && heights[i] <= heights[stk.peek()]){
                stk.pop();
            }
            rh[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }

        while(!stk.isEmpty()){
            stk.pop();
        }

        //prev smaller
        for(int i = 0;i<n;i++){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }
            lh[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }

        for(int i = 0; i<heights.length;i++){
            int width = rh[i] - lh[i] - 1;
            currArea = heights[i] * width;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}
