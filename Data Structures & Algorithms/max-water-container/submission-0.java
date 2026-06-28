class Solution {
    public int maxArea(int[] heights) {
        int marea = Integer.MIN_VALUE;
        int i=0,j=heights.length-1;
        while(i<=j){
            int l = Math.min(heights[i],heights[j]);
            int w = j-i;
            int area = l*w;
            marea = Math.max(marea,area);
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return marea;
    }
}
