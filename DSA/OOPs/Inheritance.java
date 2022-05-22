class Shape {
    public void area() {
        System.out.println("Display area: ");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
/*Multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    } 
}
*/

// Hierarchical inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5);
    }
}
