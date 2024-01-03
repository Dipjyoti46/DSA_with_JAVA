package dsawithjava;
import java.util.*;
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int target;
        System.out.println("Enter the element in the list");

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=sc.nextInt();
            }
        }
         for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(" "+arr[row][col]);
            }
            System.out.println("");
        }
        System.out.println("Enter the item to be found");
        target=sc.nextInt();
        System.out.println("Searching the item.......");
        src_in_2D(arr, target);
        
    }
    static void src_in_2D(int[][] arr, int target){
        boolean found=false;
         for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if (arr[row][col]==target) {
                    System.out.println("Item found int ("+row+","+col+") location");
                    found=true;
                    break;   
                }
            }
        }   
    }
}
