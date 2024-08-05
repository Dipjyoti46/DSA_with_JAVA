package mathes;
import  java.util.Scanner;

public class sqrRoot {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number to find square root: ");
        Scanner sc = new  Scanner(System.in);
        num = sc.nextInt();
        int root = root(num);
        if(root!=0){
            System.out.println(root(num)); 
        }
        else{
            System.out.println(fRoot(num)); 
        }

      }
    static int  root(int num){
        int mid = num/2;
       

        while(mid * mid != num ){
            mid --;
            if( mid == 0){
                return 0;
            }
        }
        return mid;
    }
    static double fRoot(int num){
        double incr = 0.1;
        double root = 0.0;
        for (int i = 0; i <= 4; i++) {
            
            while( root * root <= num){
                root += incr;
            }
            root-= incr;
            incr= incr/10;

        }
        return root;
    }
}
