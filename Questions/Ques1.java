import java.util.Scanner;

public class Ques1 {

    public static double calculateAvg(int a, int b, int c){
        return (a + b + c) / 3;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();

        System.out.println("Average of a, b and c is " + calculateAvg(a, b, c)); 
    }
    
}