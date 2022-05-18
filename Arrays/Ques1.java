import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
        }
 
        System.out.println("Enter x: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println("X found at index : " + i);
            }
            
        }
    }
    
}
