class Q20isPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0)    return false;
        List<Integer> arr=new ArrayList<>();
        
        while((float)x/10!=0){
            arr.add(x%10);
            x=x/10;
        }

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=arr.get(arr.size()-i-1)){
                return false;
            }

        }
         return true;       
    }
}