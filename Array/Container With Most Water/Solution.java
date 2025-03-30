class Solution {
    public int maxArea(int[] height) {

        int lp = 0;
        int rp = height.length-1;
        int maxWtr = 0;

        while(lp<rp){
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int currWtr = w*h;
            maxWtr = Math.max(maxWtr,currWtr);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWtr;
        
    }
}
