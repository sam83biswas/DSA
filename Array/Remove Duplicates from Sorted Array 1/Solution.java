class Solution {
    public int removeDuplicates(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        int i = 0;

        int num = nums[0];
        int cnt = 0;
        while(i<nums.length){
            if(num == nums[i]){
                cnt++;
            }else{
                num = nums[i];
                cnt = 1;
            }

            if(cnt<3){
                q.add(nums[i]);
            }

            i++;
        }

        int idx = 0;

        while(!q.isEmpty()){
            nums[idx++] = q.remove();
        }
        
        return idx;
    }
}
