import java.util.*;
public class eg_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elements of Array");
            numbers[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
