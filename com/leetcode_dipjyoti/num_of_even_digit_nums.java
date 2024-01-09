package com.leetcode_dipjyoti;

import java.util.Scanner;
public class num_of_even_digit_nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,134,43,5000};
        System.out.println("No of even digit number "+evendigit(arr));
    }    
    static int evendigit(int[] arr){
        String temp;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            temp=Integer.toString(arr[i]);
            temp=Integer.toString(arr[i]);
            if(temp.length()%2==0){
                count++;
            }

        }
        return count;
    }
}
