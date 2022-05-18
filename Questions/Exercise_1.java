import java.util.*;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner14;

public class Exercise_1 {

    /* 
    1. Enter 3 numbers from the user & make a function to print their average.
    public static void avg(int a,int b,int c) {
        int avg = (a+b+c)/3;
        System.out.println("Average of number is: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enten a: ");
        int a = sc.nextInt();
        System.out.println("Enten b: ");
        int b = sc.nextInt();
        System.out.println("Enten c: ");
        int c = sc.nextInt();

        avg(a,b,c);
    }   
    */

    /*
    2. Write a function to print the sum of all odd numbers from 1 to n.
    public static void oddSum(int n) {
        for (int i=1; i<=n; i++) {
            int sum = 2*i-1;
            System.out.println("Sum of numbers are: " + sum); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int n = sc.nextInt();
        oddSum(n);
    }
    */

    /*
    3. Write a function which takes in 2 numbers and returns the greater of those two.
    public static void greaterNumber(int a,int b) {
        if (a > b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is lesser than b");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        greaterNumber(a, b);
    }
    */

    /*
    4. Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void circleCircumference(int r) {
        double circumference = 2*3.14*r;
        System.out.println("Circumference of circle is: " + circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r = sc.nextInt();
        circleCircumference(r);
    }
    */

    /*
    5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void checkingageforVote(int age) {
        if (age > 18) {
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        checkingageforVote(age);
    }
    */

    /*
    6. Write an infinite loop using do while condition.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = sc.next();
         
        do {
            System.out.println("Your name is: " + Name);
        } while (true); 
    }
    */

    /*
    7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
    public static void checkNumber(int n) {
            if (n>0) {
                System.out.println("Positive");
            } else if(n<0) {
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            checkNumber(n);
        } while (true);
    }
    */

    /*
    8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
    public static void numberPower(int x,int n) {
        if (n%2==0) {
            System.out.println((x,n/2)*(x,n/2));
        } else {
            System.out.println(x*(x,n/2)*(x,n/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        numberPower(x, n);
    }
    */

    /*
    9. Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public static int gcd(int a,int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
    */

    // 10. Write a program to print Fibonacci series of n terms where n is input by user :
        // 0 1 1 2 3 5 8 13 21 ..... 
       //  In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

       public static void printFibonacci(int n) {
           int n1=0,n2=1,n3;
           System.out.print(n1 + " " + n2);//printing 0 and 1 
           for(int i=2;i<n;i++){
               n3 =n1+n2;
               System.out.print(" "+n3);
               n1=n2;
               n2=n3;
           }
       }
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter n: ");
           int n = sc.nextInt();
           printFibonacci(n);
       }

}
