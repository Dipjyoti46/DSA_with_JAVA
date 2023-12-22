package dsawithjava.question;
import java.util.Scanner;
public class alphabat_case_check {
    public static void main(String[] args){ 

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Char:");
        char ch=sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        }
    }
}
