import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter butoon: ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println(" Addition: " + (a + b));
                break;
            case 2:
                System.out.println(" Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            default: System.out.println("Division: " + (a / b));
                break;
        }
    }
}


            