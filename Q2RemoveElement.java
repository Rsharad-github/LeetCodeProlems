class Q2RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
    public static void main(String[] args) {
        Q2RemoveElement re = new Q2RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = re.removeElement(nums, val);
        System.out.println(result);
        while(result>0){
            System.out.print(nums[result-1]+" ");
            result--;
        }
    }
}