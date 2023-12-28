package dsawithjava.question;
import java.util.Scanner;
public class max_value {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[4];
        int max=0;
        System.out.println("Enter the values in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("The max value is: "+max);

    }

}
