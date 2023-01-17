package OOPs;

public class practicing_objects {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.rollno=456;
        System.out.println(Student1);
    }
}
class Student {
    int rollno;
    String name;
    float marks;
}

