package dsawithjava.question;
import java.util.Scanner;

public class occurence_count {
    public static void main(String[] args){
        int num, rem, occ; 
        //num= entered number; rem=reminder; occ=occurence count
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        occ=0;

        while(num!=0){
            rem=num%10;
            if(rem==3){
                occ+=1;
            }
            num=num/10;
        }
        System.out.println("occurence of 3 is :"+occ);

    }
}
