import java.util.*;
import java.util.function.IntToDoubleFunction;
public class circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int r = sc.nextInt();
        double area = 3.14*r*r;

        System.out.println("area of circle : " + area);
        
    }
}
