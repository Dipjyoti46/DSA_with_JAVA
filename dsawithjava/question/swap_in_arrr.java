package dsawithjava.question;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class swap_in_arrr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int index1,index2;
        System.out.println("Swap index:");
        index1=sc.nextInt();
        System.out.println("With index:");
        index2=sc.nextInt();
        System.out.println("Enter elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array befor swap:"+Arrays.toString(arr));
        swap(arr,index1,index2);
        System.out.println("The array after swap:"+Arrays.toString(arr));

    }
    static void swap(int[] arr,int index1, int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
