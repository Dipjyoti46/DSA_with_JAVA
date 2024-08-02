package mathes;
import  java.util.*;

public class primeNum {
    public static void main(String[] args) {
        System.out.println("Enter the Number to check is prime: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[];

        for (int i = 0; i <= num; i++) {
            System.out.println(i+" Is prime :" +isPrime(i));
        }
        System.out.println("Prime number are: ");
        for (int i = 0; i < num; i++) {
            if(isPrime(i)){
                System.out.print(i+ ",");
            }
        }
            

    }
    static boolean  isPrime(int num){
        int temp = num/2;
        
        if(num <= 2){
            return true;
        }
        else if (num > 2) {
            for (int i = 2; i <=temp; i++) {
                if(num%i == 0){
                    return false;
                }
            }
        }
           return true;
        

    }
}
