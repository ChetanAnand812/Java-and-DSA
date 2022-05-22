
class Pen {
    String color;
    String type; // ballpoint or gel 

    public void write() {
        System.out.println("writing something");
    }

//     ‘this’ keyword :  ‘this’ keyword in Java that refers to the current instance of the class. In OOPS it is used to: 
//        1. pass the current object as a parameter to another method 
//        2. refer to the current class instance variable

    public void printColor() {
        System.out.println(this.color); // this keyword is used to tell which object calling 
    }
}

public class Eg1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();
        pen1.write();
    }
}