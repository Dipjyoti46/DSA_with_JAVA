package dsawithjava.pattern;

import java.util.Scanner;

public class CreatePattern {
    public static void main(String[] args) {

        System.out.println("Enter the size of the pattern: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("This is patter 1:");
        pattern1(n);
        System.out.println("This is patter 2:");
        pattern2(n);          
        System.out.println("This is patter 3:");
        pattern3(n);          
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    static void pattern2(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
    
       for (int i = 1; i <= n; i++) {
        if( i <= n/2){
           for (int j = 0; j < n; j++) {
            
           }
        }
        else{
            pattern2(i); 
            
        }
       }

    }
    
}
