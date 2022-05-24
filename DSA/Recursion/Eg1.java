// Recursion -- Function that call itself
// outer function do some steps and assume inner function do rest of work

// Q. print number from 5 to 1

import java.util.*;
public class Eg1 {

    public static void printNumber(int n) {
        if(n == 0) {   // for base case
            return;
        }
        System.out.println(n); // print
        printNumber(n -1); // recursion call
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printNumber(n);
    }
}