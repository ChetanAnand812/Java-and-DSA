class Student {
    String name;
    static String school;
}

public class Static_keyword {
    public static void main(String[] args) {
        Student.school = "JMV";
        Student student1 = new Student();
        student1.name = "tony";
        System.out.println(student1.name);
        System.out.println(student1.school);
    } 
}

