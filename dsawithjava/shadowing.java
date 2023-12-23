package dsawithjava;

public class shadowing {
    static int x=100; //Global Value
    public static void main(String[] args) {
        System.out.println(x);
        int x=90;//local value| here the local value shadowing the global value
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }

}
