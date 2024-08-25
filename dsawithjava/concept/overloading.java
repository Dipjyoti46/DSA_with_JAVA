package dsawithjava;
import java.util.*;

public class overloading {

    public static void main(String[] args) {
        System.out.println("Method Overloading Example: ");
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value for A: ");
        a=sc.nextInt();
        System.out.println("Enter the value for B: ");
        b=sc.nextInt();
        System.out.println("Enter the value for C: ");
        c=sc.nextInt();
        sum(a,b);
        sum(a,b,c);
    }
    static void sum(int num1,int num2){
        int sum;
        sum=num1+num2;
        System.out.println("The sum of two integer is :"+sum);
    }
    static void sum(int num1,int num2,int num3){
        int sum;
        sum=num1+num2+num3;
        System.out.println("The sum of three integer is :"+sum);
    }

}
