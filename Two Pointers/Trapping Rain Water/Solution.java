class Solution {
    public int trap(int[] height) {
        int ans = 0;

        int lb = 0;
        int rb = height.length-1;

        int lh = height[lb];
        int rh = height[rb];

        while(lb < rb){
            lh = Math.max(height[lb],lh);
            rh = Math.max(height[rb],rh);

            if(lh < rh){
                ans += lh - height[lb];
                lb++;
            }else{
                ans += rh - height[rb];
                rb--;
            }


        }

        return ans;


    }
}
