class Q5MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];
      
        for (int num:nums){
            if(element  ==  num){
                count++;
            }else{
                count--;
            }
            
            if(count==0){
                element=num;
                count++;
            }
        }
        return element;
    }
}