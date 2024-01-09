package dsawithjava.oops;

public class InnerClass {
    static class Test{
        String name;
        Test(String name){
            this.name=name;
        }
    }
    static class Test2{
        String name;
        Test2(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test studTest=new Test("Dipjyoti");
        Test2 studTest2=new Test2("Mallika");
        System.out.println(studTest.name);
        System.out.println(studTest2.name);
    }
}

