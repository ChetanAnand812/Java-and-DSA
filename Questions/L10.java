import java.util.*;
public class L10 {
    /*
    1. Take an array of names as input from the user and print them on the screen.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        String name [] = new String[size];
        // input
        for(int i=0;i<size;i++){
            name[i] = sc.next();
        }
        // output
        for(int i=0;i<size;i++){
            System.out.print(name[i] + " ");
        }

    }
    */

    /*
    2. Find the maximum & minimum number in an array of integers. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // input
        for(int i=0;i<size;i++){
            arr [i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // output
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
    */

    /*
    3. Take an array of numbers as input and check if it is an array sorted in ascending order.
        Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        {3, 4, 6, 2} is not sorted in ascending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // input
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<size-1;i++){       // NOTICE size - 1 as termination condition
            if(arr[i] > arr[i+1]){        // This is the condition for descending order
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ascending oorder");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
    */
    
}



