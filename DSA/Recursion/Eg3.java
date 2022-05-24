//Q. Print sum of n natural numbers
import java.util.*;
public class Eg3 {

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println("Sum of n is : " + sum);
            return; //
        }
        sum = sum + i;
        printSum(i+1, n, sum);  // recursion call
        System.out.println(i); 
    }

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        printSum(i, n, sum);
        
    }
}
