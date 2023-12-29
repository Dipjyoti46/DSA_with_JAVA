package searching;

import java.util.Scanner;

public class linner_search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the item to search: ");
        int target=in.nextInt();
        search(arr, target);
    }

    static void search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("The index of the searching item is: "+i+1);
                break;
            }
            else{
                System.out.println("Item not found in the array!");
                break;
            }
        }
    }
}
