package dsawithjava.leetcode;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,4,4,6};
        int val= 4;
        remove(nums,val);
    }
    public static void remove(int[] nums, int val){
        int[] temparr=new int[nums.length];
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                temparr[j]=nums[i];
                j++;
            }
        }
        System.arraycopy(temparr, 0, nums, 0, temparr.length);
        System.out.println(Arrays.toString(nums));
        
    }

}
