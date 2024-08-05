package dsawithjava.recurssion;
import  java.util.*;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findfactorial(num));
    }
    static int findfactorial(int num){
        while(num>0){
            return  num*findfactorial(num-1);
        }
        return 1;
    }
}
