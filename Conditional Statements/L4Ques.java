import java.util.*;
public class L4Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 0; i<=n;i++){
            if(n%2==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        }


    }
}
