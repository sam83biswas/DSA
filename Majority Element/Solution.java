class Solution {
    public int majorityElement(int[] nums) {
        int max = nums.length/2;
        int ans = 0;
        Arrays.sort(nums);
        int c = Integer.MIN_VALUE;
        int count = 1;
        if(nums.length == 1){
            return nums[0];
        }
        else{
            for(int i = 1;i<nums.length;i++){
                while(i<nums.length && nums[i-1] == nums[i]){
                    count++;
                    i++;
                }
                if(count>c){
                    c = count;
                    ans = nums[i-1];
                    count = 1;
                }

            }

            return ans;

        }
        
    }
}
