package dsawithjava;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args){
        System.out.println("Using Switch Case::");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the following option:\n1.Father\n2.Mother\n2.Sister\n4.Wife\n");
        String relation=sc.next();
        System.out.print("My "+relation+" name is ");

        switch (relation) {
            case "Father":
                System.out.print("A.Saikia");
                break;
            case "Mother":
                System.out.print("S.Saikia");
                break;
            case "Sister":
                System.out.print("D.Saikia");
                break;
            case "Wife":
                System.out.print("M.Saikia");
                break;
            default:
                System.out.println("Enter a valid relation");
        }
    }

}
