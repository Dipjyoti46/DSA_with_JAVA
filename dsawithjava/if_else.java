package dsawithjava;

import java.util.Scanner;

public class java03 {
    public static void main(String[] args){
        int salary;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Salary of the Employee: ");
        salary=input.nextInt();
        if(salary>=10000){
            System.out.println("Bonus is 5%");
            salary+=salary*0.05;
            System.out.println("Salary is: "+salary);
        }
        else if(salary>=5000){
            System.out.println("Bonus is 2%");
            salary+=salary*0.02;
            System.out.println("Salary is: "+salary);
        }
        else{
            System.out.println("Bonus is 0%");
            System.out.println("Salary is: "+salary);
        }

    }
}
