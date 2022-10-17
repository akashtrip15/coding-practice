class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return false;
        }
       Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        if(n==set.size()){
            return false;
        }else{
           return true;
        }
    }
}