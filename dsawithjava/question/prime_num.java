package dsawithjava.question;
import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        Boolean ans= check_prime(num);
        System.out.println(ans);

        
    }
    static boolean check_prime(int num){
        if (num<=1) {
            return false;
            
        }
        int c=2;
        while (c*c<=num) {
            if (num%c==0) {
                return false;
            }
            c++;
        }
        
        return  c*c>num;

    }
}
