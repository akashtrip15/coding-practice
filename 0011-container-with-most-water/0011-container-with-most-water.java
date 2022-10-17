class Solution {
    public int maxArea(int[] height) {
         int n= height.length;
         if(n==0){
             return 0;
         }
        int maxArea = 0;
        for(int i =0, j=n-1; i<j;){
            int temp = (j-i) * Math.min(height[i], height[j]);
            if(temp>maxArea){
                maxArea = temp;
            }
            if(height[i]>height[j]){
                j--;
            }else if(height[i]<height[j]){
                i++; 
            }else{
                i++; 
                j--;
            }
        }
        
        return maxArea;
    }
}