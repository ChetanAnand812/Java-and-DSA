import java.util.*;

public class Q3_Product_of_2_no {
    
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();

        System.out.println("Product of a and b is " +calculateProduct(a, b));
    }
}
