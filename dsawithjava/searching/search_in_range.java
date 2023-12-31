package searching;
import java.util.Scanner;

public class search_in_range {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the element in the array: ");
        int[] array=new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=in.nextInt();
        System.out.println("Enter the starting and ending index: ");
        System.out.println("Start index: ");
        int range_strt=in.nextInt();
        System.out.println("End Index: ");
        int range_end=in.nextInt();

        in_range(array, target, range_strt, range_end);

    }
    static void in_range(int[] arr, int target, int range_strt, int range_end){
        for (int i = range_strt; i < range_end; i++) {
            if (target==arr[i]) {
                System.out.println("Target found at index "+i);
                break;
            }
            else if(i==range_end && target!=arr[i]){
                System.out.println("Item not found in rage");
            }
        
        }
    }

}
