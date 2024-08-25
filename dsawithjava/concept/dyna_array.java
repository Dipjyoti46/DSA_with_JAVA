package dsawithjava;

import java.util.ArrayList;
import java.util.Scanner;

public class dyna_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<Integer>(10);

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        list.set(0, 99);
        System.out.println(list);
        System.out.println(list.size());

    }

}
