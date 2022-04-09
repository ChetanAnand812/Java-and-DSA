import java.util.*;

public class Ques1_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows] [cols];
         
        // input
        for(int i = 0;i < rows;i++){
           for (int j = 0; j < cols; j++) {
            numbers[i][j] = sc.nextInt();           
           }
        }
        
        System.out.println("Enter x:");
        int x = sc.nextInt();

        // output
        for(int i = 0;i < rows;i++){
            for (int j = 0; j < cols; j++) {
                if(numbers[i][j] == x ) {
                    System.out.println("X found at index : (" + i + "," + j + ")");
                }
            }
            
        }

    }
}
