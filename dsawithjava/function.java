package dsawithjava;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=0;
        while(value==0){
            relatives();
            System.out.println("To exit enter 1"+sc.nextInt());
        }
        
    }
static void relatives(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the relation: ");
        String relation=sc.nextLine();
        System.out.println("Enter the name of the person");
        String name=sc.nextLine();
        System.out.println(name+" is my "+relation);
}
}
