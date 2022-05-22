import java.util.*;
public class Selection_Sort {
    public static void printArray(int arr[], int size) {
        System.out.println("Sorted Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
        }

        // time complexity --> O(n^2)
        // Selection sort
        for (int i = 0; i < size-1; i++) {
            int smallest = i;
            for (int j = i+1; j < size; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
       
        printArray(arr, size);
    }
}
