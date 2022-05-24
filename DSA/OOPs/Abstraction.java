/* Using Abstract keyword
abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("You are creating a new Animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse() {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println("--------");
        horse.walk();
        horse.eat();
    }
}

*/ 


// Using Interface Keyword
interface Animal {
    public void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}

// we can use multiple inheritance using interface keyword