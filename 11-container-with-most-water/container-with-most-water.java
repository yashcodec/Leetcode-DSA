class Solution {
    public int maxArea(int[] height) {
        
        int left =0;
        int right=height.length -1;
        int maxarea=0;
        while(left<right){
            int width= right-left;
            int minheight=Math.min(height[left],height[right]);
            int currarea=width*minheight;
            maxarea=Math.max(maxarea,currarea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}