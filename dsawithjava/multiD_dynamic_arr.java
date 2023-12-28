package dsawithjava;

import java.util.ArrayList;
import java.util.Scanner;

public class multiD_dynamic_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        System.out.println("Enter the number of Dimension: ");
        int dim=sc.nextInt();
        System.out.println("Enter the element:");
        for (int i = 0; i < dim; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < dim; i++) {
            System.out.println("Row:"+i);
            for (int j = 0; j < dim; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
}
