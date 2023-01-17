package OOPs;

class Students{
    String name;
    int age;

    Students(String name) {
        this.age = 50;
        this.name = name;
    }
}
public class practicing_constructor {
    public static void main(String[] args) {
        Students Stud_1 = new Students("Rameshwar");
//        Stud_1.name = "Sandeep";
        System.out.println(Stud_1.name+Stud_1.age);
        Integer a = 10;
        a.byteValue();


    }

}
