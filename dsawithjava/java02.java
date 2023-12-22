package dsawithjava;
import java.util.Scanner;

public class java02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num,rem,rev_num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        rev_num=0;
        
        while(num!=0){
            rem=num%10;
            rev_num=rev_num*10+rem;
            num=num/10;
        }
        System.out.println("the reversed number is "+rev_num);
    }

}
