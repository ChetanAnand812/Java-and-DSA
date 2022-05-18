import java.util.*;

public class Q2_Sum_of_2_no {

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // call
        System.out.println("Sum of a and b is " +sum);
    }
}
