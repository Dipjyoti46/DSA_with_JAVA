package dsawithjava.recurssion;

public class sumOfDigits {
    public static void main(String[] args) {
        int num=5;
        System.out.println("Sum of the digits is: "+sum(num));

    }
    static int sum(int num){
        if(num>=10){
            return (num%10)+sum(num/10);
        }
        
        return num;
    }
}
