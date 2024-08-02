package dsawithjava.searching;

import java.util.Scanner;

public class binary_search {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target;
        System.out.println("Enter the target variable: ");
        target=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,23,34,45,56,67,78,89};
        binSrch(arr,target);

    }
    static void binSrch(int[] arr,int target){
       int start=0;
       int end=arr.length-1;
       int mid;
       while(start<=end){
            mid=(start+end)/2;
        if (target<arr[mid]) {
            end=mid-1;
        }
        else if (target>arr[mid]) {
            start=mid+1;
        }
        else if (target==arr[mid]) {
            System.out.println("Found at "+(mid+1)+" position");
            break;
            
        }
        else{
            System.out.println("Item not found!!!");
        }
    }
    }
}
