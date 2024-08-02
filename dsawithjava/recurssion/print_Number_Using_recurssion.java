package dsawithjava.recurssion;

public class print_Number_Using_recurssion {
    public static void main(String[] args) {
        System.out.println("print number upto 5");
        int n = 1;
        print(n);
    }
    static  void print(int n){
        System.out.println(n);
        if( n < 5){
            print(n+1);
        }
    }

}
