import java.util.*;

public class Q1_print_a_given_name {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.next();

        printMyName(name); // Function Call
    }


}
