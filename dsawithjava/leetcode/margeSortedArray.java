package dsawithjava.leetcode;

import java.util.Arrays;

public class margeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0}; 
        int nums2[] = {2,5,6};
        int m=3;
        int n=3;
        merge(nums1,m,nums2,n);

    }
    public static void merge(int[] nums1, int a, int[] nums2, int b) {
        int[] temparr = new int[a + b];
        int i=0;
        int j=0;
        int k=0;
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        while(i<a && j<b){
            if(nums1[i]>nums2[j]){
                temparr[k]=nums2[j];
                j++;
                k++;
            }
            else{
                temparr[k]=nums1[i];
                i++;
                k++;
            }
        }
        while(i<a){
            temparr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<b){
            temparr[k]=nums2[j];
            j++;
            k++;
        }
        System.arraycopy(temparr, 0, nums1, 0, temparr.length);
        System.out.println("The new array is:"+Arrays.toString(nums1));
    }
}
