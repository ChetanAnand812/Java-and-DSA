import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size = sc.nextInt();
        int n[] = new int[size];
        
        // input
        for(int i = 0;i < size;i++){
            n[i] = sc.nextInt();
        }
        
        System.out.println("Enter x:");
        int x = sc.nextInt();

        // output
        for(int i = 0;i < n.length;i++){
            if(n[i] == x ) {
                System.out.println("X found at index : " + i);
            }
        }

    }
}
