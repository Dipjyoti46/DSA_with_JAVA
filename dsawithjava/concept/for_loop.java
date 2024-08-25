package dsawithjava;
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){
        int i;
        System.out.println("Printing all odd and even number in the range");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range=input.nextInt();

        System.out.println("even numbers are: ");
        for(i=0;i<=range;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
            
        System.out.println("odd numbers are: ");
        for(i=0;i<=range;i++){
            if(i%2!=0){
                System.out.println(i);
            }
            }
        
        }
    }


