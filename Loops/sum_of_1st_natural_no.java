import java.util.*;

public class sum_of_1st_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int sum = 0; 

        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum of no is " + sum);
        
    }
}
