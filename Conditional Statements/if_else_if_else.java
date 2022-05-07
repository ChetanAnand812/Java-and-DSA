import java.util.*;

public class if_else_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        } else if (a > b) {
            System.out.println("a is greter than b");
        } else {
            System.out.println("a is lesser than b");
        }

    }
}
