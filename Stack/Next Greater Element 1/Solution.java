class Solution {
    public int findElement(int elmnt,int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(elmnt == arr[i]){
                return i;
            }
        }
        return -1;

    }
    public int nxtGrtr(int idx, int[] nums2){
        for(int i = idx+1; i<nums2.length; i++){
            if(nums2[idx]<nums2[i]){
                return nums2[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int idx = findElement(nums1[i], nums2); 
            ans[i] = nxtGrtr(idx, nums2);
        }
        return ans;
        
    }
}
