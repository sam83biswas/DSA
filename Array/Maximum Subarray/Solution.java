class Solution {
    
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int i = 0;

        while(i<nums.length){

            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum<0){
                currSum = 0;
            }
            i++;

        }

        return maxSum;
        
    }
}
