package dsawithjava.question;

import java.util.Scanner;

public class a_multi_sum_of_b_c {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,result;
        System.out.println("Enter the value of a: ");
        a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();
        System.out.println("Enter the value of c: ");
        c=sc.nextInt();
        result=a*sum(b,c);
        System.out.println("The result of a*(b+c) is : "+result);

    }
    static int sum(int num1,int num2){
        int sum;
        sum=num1+num2;
        return sum;
    }
}
