import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
