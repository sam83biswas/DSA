class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int m = nums1.length - nums2.length;
        //int n = nums2.length;
        int k = 0;
        int arr[] = new int[m+n];
        int i = 0,j = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        i = 0;
        while(i<nums1.length){
            nums1[i] = arr[i];
            i++;
        }
        
    }
}
