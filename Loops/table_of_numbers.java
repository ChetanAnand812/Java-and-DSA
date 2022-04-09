import java.util.*;

public class table_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i < 11;i++){
            System.out.println(n * i); 
        }
    }
}
