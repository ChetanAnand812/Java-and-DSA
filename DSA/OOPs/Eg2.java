/* Constructor : Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 
      Constructors have the same name as class or structure. 
      Constructors don’t have a return type. (Not even void)
      Constructors are only called once, at object creation. */


class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*  Non-Parameterized constructor
    Student() {     
        System.out.println("Constructor called");
    }
    */

    /* Parameterized constructor :
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    */

    /* Copy Constructor 
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
    */
}

public class Eg2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Chetan";
        s1.age = 19;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
