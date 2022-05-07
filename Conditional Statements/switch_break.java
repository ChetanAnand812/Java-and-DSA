import java.util.*;

public class switch_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Button");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Banjour");
                break;

            default:
                System.out.println("invalid button");
                break;
        }
    }
}
