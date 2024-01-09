package dsawithjava.oops;

public class static_nonStatic {
    public static void main(String[] args) {
        StaticMethd();
        static_nonStatic obj=new static_nonStatic();
        obj.nonStatic();
        
    }
    static void StaticMethd(){
            System.out.println("It is static");
        }
    void nonStatic(){
        System.out.println("It is non static");
    }

}
