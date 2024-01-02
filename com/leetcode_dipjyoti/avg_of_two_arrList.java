package com.leetcode_dipjyoti;
import java.util.Arrays;

public class avg_of_two_arrList {
    public static void main(String[] args) {
        int[] num1={1,3};
        int[] num2={7};
        System.out.println("The avg two array is "+twoArrAvg(num1, num2));;
    }
    static double twoArrAvg(int[] num1,int[] num2){
        double avg;
        int arr_len=num1.length+num2.length;
        int[] arr=new int[arr_len];
        for (int i = 0; i < num1.length; i++) {
            arr[i]=num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            arr[i+num1.length]=num2[i];
        }

        Arrays.sort(arr);
        System.out.println("sorted arr:"+Arrays.toString(arr));
        if(arr.length%2==0){
            double value=(arr[arr.length/2-1]+arr[arr.length/2]);
            avg=value/2;
        }
        else{
            avg=arr[arr.length/2];
        }
        return avg;
    }

    
}
