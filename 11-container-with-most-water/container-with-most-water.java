class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int max=0;
        int max_height=0;
//Two Pointer 
        while(left<right){
            if(height[left]<=height[right]){
                max=height[left];
                max*= (right- left);
                max_height= Math.max(max_height, max);
                left++;
            }else if(height[left]>= height[right]){
                max=height[right];
                max*= (right- left);
                max_height= Math.max(max_height, max);
                right--;
            }
            max=0;
        }
        return max_height;
    }
}