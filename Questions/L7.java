import java.util.*;

public class L7 {
    /*
     * Make a function to check if a number is prime or not.
     * public int static checkprime(int a) {
     * 
     * }
     */

    // Make a function to check if a given number n is even or not.
    public static boolean checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
            ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        checkEven(n);
    }

    /* Make a function to print the table of a given number n.

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int x = n * i;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no: ");
    int n = sc.nextInt();
    printTable(n); 
    */
     
}