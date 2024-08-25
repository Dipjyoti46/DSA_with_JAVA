package dsawithjava;
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){
        int i,range;
        System.out.println("Printing all odd and even number in the range");
        System.out.println("Enter the rnge for while loop");
        Scanner in=new Scanner(System.in);
        range=in.nextInt();
        i=0;
        while(i<=range){
             if(i%2==0){
          
                System.out.println(i);
             }
             i++;
         }

    }
}
