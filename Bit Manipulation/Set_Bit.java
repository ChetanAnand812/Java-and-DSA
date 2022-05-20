public class Set_Bit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1<<position;  // step 1 

        int newNumber = bitMask | n;   // step 2 -- operation: or
        System.out.println(newNumber);
    }
}