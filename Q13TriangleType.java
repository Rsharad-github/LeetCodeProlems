class Q13TriangleType {
    public String triangleType(int[] nums) {
        int sum =0;
        for (int i=0; i<3 ; i++){
            sum += nums[i];
        }
        if(sum == 0 || nums[0]>=nums[1]+nums[2] || nums[1]>=nums[0]+nums[2] || nums[2]>=nums[1]+nums[0] ){
            return "none";
        }

        if(nums[0]==nums[1] && nums[0]==nums[2]){
            return "equilateral";
        }else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]){
            return "isosceles";
        } else{
            return "scalene";
        }
    }
}