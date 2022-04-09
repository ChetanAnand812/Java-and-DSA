import java.util.Scanner;

public class Q4_Factorial_of_no {
    
    public static void calculateFactorial(int n) {
        int factorial = 1;
        
        if(n < 0){
            System.out.println("Invalid number");
            return;
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of n is "+factorial);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        calculateFactorial(n);

    }
}
