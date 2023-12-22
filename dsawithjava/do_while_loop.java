package dsawithjava;
import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args){
        int i, range;
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        range=sc.nextInt();
        i=0;

        do {
            System.out.println(i);
            i++;
        }
        while (i<=range);
    }

}
