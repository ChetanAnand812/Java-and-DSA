public class Clear_Bit {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;   // step 1
        int notBitMask = ~(bitMask);  // step 2
        
        int newNumber = notBitMask & n;  // step 3
        System.out.println(newNumber);
    }
}
