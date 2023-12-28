package dsawithjava.question;
import java.util.Arrays;
import java.util.Scanner;
public class reverrse_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("Enter the values in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Original Array: "+Arrays.toString(arr));
        int j=arr.length-1;
        for(int i = 0; i < arr.length/2; i++) {
            if(i!=j){
                swap(arr, i, j);
                j--;
            }
        }
        System.out.println("Revirsedss Array: "+Arrays.toString(arr));


    }
        static void swap(int[] arr, int index1,int index2){
            int temp;
            temp=arr[index2];
            arr[index2]=arr[index1];
            arr[index1]=temp;
        }
    }
