class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        List<List<Integer>> finalAns = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            for(int j = i+1;j<nums.length;){
                int p = j+1;
                int q = nums.length - 1;

                while(p<q){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[p] + (long)nums[q];

                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[p]);
                        ans.add(nums[q]);
                        finalAns.add(ans);
                        p++;
                        q--;

                        while(p < q && nums[p] == nums[p-1]){
                            p++;
                        }
                    }

                    
                    
                }
                j++;
                while(j<nums.length && nums[j-1] == nums[j]){
                    j++;
                }
            }
        }
        return finalAns;
    }
}
