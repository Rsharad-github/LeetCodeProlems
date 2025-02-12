import java.util.*;
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] num = new int[m+n];
       int i=0,j=0,k=0;

        if(m==0||n==0){  
            if(m==0) {
                while(j<n){
                    num[k] = nums2[j];
                    j++;
                    k++;
                }
            }
            else {
                while(i<m){
                    num[k] = nums1[i];
                    i++;
                    k++;
                }
            }
                    
        }else{
            while (i<m && j<n ){
                if(nums1[i] <= nums2[j]){
                    num[k] = nums1[i];
                    i++;
                
                }else{
                    num[k]=nums2[j];
                    j++;
               
                }
                k++;

                if(i == m){
                    while(j<n){
                        num[k] = nums2[j];
                        j++;
                        k++;
                    }
                }
                if(j == n){
                    while(i<m){
                        num[k] = nums1[i];
                        i++;
                        k++;
                    } 
                }
            }
        }
        i=0;
        while(i<m+n) {
            nums1[i] = num[i];
            i++;
        }
    }


    public static void main(String[] args) {
      MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        msa.merge(nums1, m, nums2, n);
        for(int i=0; i<nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}

