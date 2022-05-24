// Q. Print number from 1 to 5

import java.util.*;
public class Eg2 {

    private static void printNumber(int n) {
        if(n == 6) {  // base case
            return;
        }
        System.out.println(n);
        printNumber(n + 1); // recursion call
    }

    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
}
