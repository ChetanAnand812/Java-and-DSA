import java.util.*;

public class Method_in_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String first = sc.nextLine();
        System.out.println("Enter second string:");
        String second = sc.nextLine();

        // Concatenation
        String yourString = first + " " + second;
        System.out.println(yourString);

        // length
        System.out.println("Length of String: " + yourString.length());

        // charAt
        for (int i = 0; i < yourString.length(); i++ ){
            System.out.println(yourString.charAt(i));
        }

        // compare
        if(first.compareTo(second) == 0){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("String are not equal.");
        }

        // substring(begning index, ending index)
        String sentence = "My name is Chetan";
        System.out.println("Sub String is : " + sentence.substring(4,6));
        

        // Strings are Immutable 

    }
}