public class Get_Bit {
    public static void main(String[] args) {
        int n = 5; //0101
        int position = 2;
        int bitMask = 1<<position;  // step 1 

        if ((bitMask & n ) == 0) {            // step 2 -- operation: and
            System.out.println("Bit was zero");
        } else{
            System.out.println("Bit was one");
        }
    }
}
