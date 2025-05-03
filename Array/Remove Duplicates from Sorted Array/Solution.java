class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int high = nums[nums.length-1] + 1;
        for(int i = 1;i<nums.length;i++){
           while(i<nums.length && nums[i-1] == nums[i]){
            nums[i-1] = high;
            i++;
           }
        }

        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if(nums[i]==high){
                break;
            }
            count++;
        }

        return count;
    }
}
