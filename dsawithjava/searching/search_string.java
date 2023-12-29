package searching;
import java.util.Scanner;
public class search_string {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name or random string: ");
        String name=in.next();
        System.out.println("Enter the char to search: ");
        char target=in.next().charAt(0);
        srcString(name,target);

    }
    static void srcString(String s, char target){
        for (int i = 0; i < s.length(); i++) {
            
            if(s.length()==0){
                System.out.println("String is empty!!");
            }
            else if (s.charAt(i)==target) {
                System.out.println("Character found "+i+" index");
                break;
            }
            else if(i==s.length()-1 && (s.charAt(i))!=target){
                System.out.println("Not Found !!");
            }

            
        }
    }
}
