package dsawithjava;

import java.util.Arrays;

//In variable Length Arguments we can insert any number of string or intergers or any data types
//The syntx for this is  function(String ...v) or (int ..v)
//This data type should be in the last of the function insertion
public class vari_leng_args {
    public static void main(String[] args) {
        System.out.println("The Vari Lang Argument example:");
        variLeng(1,2,3,4,5);
        variLeng2("Apple","orange","Coconut");
    }
    //Using Integer
    static void variLeng(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //Using String
    static void variLeng2(String ...s){
        System.out.println(Arrays.toString(s));
    }

}
