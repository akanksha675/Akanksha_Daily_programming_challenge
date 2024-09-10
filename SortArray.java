import java.util.Arrays;

public class SortArray {

    // Function to sort an array of 0s, 1s and 2s
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment both low and mid
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                
                case 1:
                    // Move mid to next element
                    mid++;
                    break;
                
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}