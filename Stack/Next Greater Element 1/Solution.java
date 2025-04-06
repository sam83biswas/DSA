class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];

        for(int i = nums2.length-1; i>=0; i--){
            while( !stk.isEmpty() && nums2[i]>=nums2[stk.peek()]){
                stk.pop();
            }
            if(stk.isEmpty()){
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i],nums2[stk.peek()]);
            }
            stk.push(i);
        }

        for(int i = 0;i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;

    }
}
