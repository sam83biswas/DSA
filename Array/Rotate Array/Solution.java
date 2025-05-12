class Solution {
    public void rotate(int[] nums, int k) {
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i = 0;i<nums.length;i++){
            ll.addLast(nums[i]);
        }

        int j = 0;
        while(j<k){
            ll.addFirst(ll.removeLast());
            j++;
        }

        int i = 0;
        while(i<nums.length){
            nums[i++] = ll.removeFirst();
        }

    }
}
