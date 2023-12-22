package dsawithjava.question;
import java.util.Scanner;
public class largest_num {
    public static void main(String[] args){
        int a,b,c,largest;
        Scanner sc= new Scanner(System.in);
        System.out.println("value of a");
        a=sc.nextInt();
        System.out.println("value of b");
        b=sc.nextInt();
        System.out.println("value of c");
        c=sc.nextInt();
        largest=a;
        if(largest<b){
            largest=b;
        }
        if(largest<c){
            largest=c;
        }
        System.out.println("Largest number is "+largest);
    }
}