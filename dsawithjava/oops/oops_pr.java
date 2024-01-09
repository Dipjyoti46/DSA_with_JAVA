package dsawithjava.oops;

public class oops_pr {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2=new Student(10,"Dipjyoti Saikia", 13.0f);
        System.out.println(student1.roll+","+student1.name+","+student1.marks+","+Student.population);
        System.out.println(student2.roll+","+student2.name+","+student2.marks+","+Student.population);
        System.out.println(Student.toString(student1));
        
    }

}
class Student{
    int roll;
    String name;
    float marks;
    static int population;

    Student(){
        this.roll=0;
        this.name="null";
        this.marks=0.0f;
        population+=1;
    }
    Student(int roll, String name, float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
        //this.population+=1;
        Student.population+=1;
    }
}