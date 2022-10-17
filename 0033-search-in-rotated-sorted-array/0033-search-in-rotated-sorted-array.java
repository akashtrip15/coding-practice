class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n==0){
           return -1;
        }
       
        for(int i= n-1; i>=0; i--){
            if(nums[i] == target){
               return i;
            }
        }
        return -1;
    }
}