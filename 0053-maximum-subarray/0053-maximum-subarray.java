class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       if(n==0){
           return 0;
       }
       int maxSum = nums[0];
        int temp =0;
        for(int i=0; i<n; i++){
            temp+=nums[i];
            if(maxSum<temp){
                maxSum = temp;
            }
            if(temp<0){
                temp=0;
            }
        }
    return maxSum;
    }
}