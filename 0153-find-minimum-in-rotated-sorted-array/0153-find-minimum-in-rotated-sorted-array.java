class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int min = nums[n-1];
        for(int i= n-2; i>=0; i--){
            if(nums[i]<= min){
                min= nums[i];
            }else{
                return min;
            }
        }
        return nums[0];
    }
}