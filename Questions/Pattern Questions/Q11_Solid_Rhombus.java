import java.util.*;

public class Q11_Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");     
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
