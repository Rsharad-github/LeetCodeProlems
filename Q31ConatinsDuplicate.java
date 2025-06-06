class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Boolean> hp = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++){
            if(hp.containsKey(nums[i])){
                return true;
            }else{
                hp.put(nums[i],true);
            }
        }
        return false;
    }
}