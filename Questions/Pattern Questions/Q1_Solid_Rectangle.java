import java.util.*;
public class Q1_Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int n = sc.nextInt();
        System.out.println("Enter Columns");
        int m = sc.nextInt();
        
        //outer loop
        for (int r = 0; r < n; r++) {
            //inner loop
            for (int c = 1; c <= m; c++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        
    }
}
