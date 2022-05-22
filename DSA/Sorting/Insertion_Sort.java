import java.util.*;
public class Insertion_Sort {
    public static void printArray(int arr[], int size){
        System.out.println("Sorted Array is: ");
        for(int i=0;i<size;i++){
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
        for(int i = 0; i < size;i++){
            arr[i] = sc.nextInt();
        }
        
        //Insertion
        for(int i=0;i<size;i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        printArray(arr, size);
    }
}
