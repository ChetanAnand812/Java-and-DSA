import java.util.Scanner;

public class Bubble_Sort {
    public static void printArray(int arr[], int size) {
        System.out.println("Sorted values is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        System.out.println("Enter array values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        } 
        
        // time complexity --> O(n^2) 
        // bubble sort
        for (int i = 0; i < size-1; i++) {      // n-1
            for (int j = 0; j < size-i-1; j++) {  // n-i-1
                if (arr[j]>arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        printArray(arr, size);
    }
}
