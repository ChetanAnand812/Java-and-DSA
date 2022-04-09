import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //String Declaration
        String fullname = "Chetan Anand";
        String sentence = "My name is Chetan";
        System.out.println("Hello " + sentence);

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
    } 
}

