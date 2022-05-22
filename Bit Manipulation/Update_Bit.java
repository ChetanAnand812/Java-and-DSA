import java.util.*;
public class Update_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : set, oper=0: clear
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1<<position;   

        if (oper == 1) {
            // set 
            int newNumber = bitMask | n;   // for making 1
            System.out.println(newNumber);
        }
        else{
            // clear
            int notBitMask = ~(bitMask);  
            int newNumber = notBitMask & n;  // for making 0
            System.out.println(newNumber);
        }        
    }
}
