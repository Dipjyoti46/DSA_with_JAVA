package dsawithjava.question;
import java.util.Scanner;

public class fibbonaci_series {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range=sc.nextInt();
        int a,b,temp;
        a=0;
        b=1;
        System.out.println("The series :");
        for(int i=0; i<=range; i+=1){
            System.out.println(a);//0,1,1
            temp=a;
            a=b;
            b=temp+b;
        }
    }
}

