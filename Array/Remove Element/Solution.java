class Solution {
    
    public int removeElement(int[] nums, int val) {
        int size = 0;
        int l = nums.length-1;

        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val){
                while(l>=0 && nums[l]==val){
                    l--;
                }
                if(l>=0){
                    nums[i] = nums[l];
                    l--;
                }
                
                size++;
            }
        }

        return nums.length-size;

    }
}
