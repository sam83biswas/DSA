class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stk = new Stack<>();
        int n = nums.length;
        int[] ans = new int[nums.length];

        for(int i = 2*n-1; i>=0; i--){
            while(!stk.isEmpty() && nums[i%n] >= nums[stk.peek()]){
                stk.pop();
            }
            ans[i%n] = stk.isEmpty() ? -1 : nums[stk.peek()];
            stk.push(i%n);
        }

        return ans;
        
    }
}
