package searching;
import java.util.Arrays;
import java.util.Scanner;
public class search_in_2d {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[][] arr=new int[4][4];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("The array is :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");        
            }
            System.out.println();
        }
        System.out.println("Enter the target:");
        int target=in.nextInt();
        search2D(arr,target);
    }
    static void search2D(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    System.out.println("Item found at ("+i+","+j+") index");
                }
            }
            
        }
    }
}
