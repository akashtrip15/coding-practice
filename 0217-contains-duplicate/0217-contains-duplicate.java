class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return false;
        }
      Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));	
        if(n==set.size()){
            return false;
        }else{
           return true;
        }
    }
}