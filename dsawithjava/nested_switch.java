package dsawithjava;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Lets assume there are more than one student with same name ID but different name and department
        System.out.println("Enter the Student ID:");
        int sid=sc.nextInt();
        System.out.println("Enter the department name:");
        String dept=sc.next();

        switch (sid) {
            case 1:
                switch(dept){
                    case "cse": System.out.println("Mallika Sakrar from CSE");break;
                    case "ce": System.out.println("Mallika Saikia from Civil Eng");break;
                    default : System.out.println("enter th valid department");
                }
                break;
            case 2:
                switch(dept){
                    case "cse": System.out.println("Dipjyoti Saikia from CSE");break;
                    case "cE": System.out.println("Dipjyoti from Civil Eng ");break;
                    default : System.out.println("enter the valid department");
                }
            break;
                
            default:
                System.out.println("Enter the valid student ID");
                break;
        }

    }
}
