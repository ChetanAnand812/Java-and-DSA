import java.util.*;

public class a_and_b_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } 
        else if (a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }
}
