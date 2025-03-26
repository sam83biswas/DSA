class Solution {
    public int majorityElement(int[] nums) {
        int frq = 0;
        int ans = 0;

        for(int i = 0; i<nums.length;i++){
            if(frq == 0){
                ans = nums[i];
            }

            if(ans == nums[i]){
                frq++;
            }else{
                frq--;
            }
        }

        return ans;
    }
}
