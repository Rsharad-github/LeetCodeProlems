class Q9JumpGameI{

    public static boolean main(String[] args) {
    int reach=0;
    int[] nums = {3,2,1,0,4};
        for (int i=0 ; i<nums.length ; i++){
            if(i>reach){
                return false;
            }
          reach = Math.max(reach,i+nums[i]);
          if(reach>=nums.length-1) {
            return true;
            }
        }
        return false;
    }
}