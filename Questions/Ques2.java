import java.util.*;

public class Ques2 {

    public static void sumofOdd(int n) {
        int s = 0;
        while (n > 0) {
            if(n % 2 == 1){
                s = s + n;
            }
            n --;
            
        }
        System.out.println("Sum of Odd number is: " +s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        sumofOdd(n);
    }
}
