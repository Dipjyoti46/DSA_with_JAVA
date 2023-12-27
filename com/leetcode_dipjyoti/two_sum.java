package com.leetcode_dipjyoti;
import java.util.Arrays;
import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[4];
        int[] result=new int[2];
        int target;
        System.out.println("Enter the 4 values of the array: ");
        for(int i=0;i<4;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        target=sc.nextInt();

        result=two_sums(nums, target);
        System.out.println("The values are "+Arrays.toString(result));

    }
    static int[] two_sums(int[] nums,int target){

        int[] two_nums=new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                       two_nums=new int[] {i,j};
                       break;
                    }
                }
            }
        }

        return two_nums;
    }
}
