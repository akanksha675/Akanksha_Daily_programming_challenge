/*You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.

Example

Input: arr = [16, 17, 4, 3, 5, 2]

Output: Leaders: [17, 5, 2]
*/
import java.util.Arrays;
    public class day5 {
        public static int[] findLargerOnRight(int[] arr) {
            int[] result = new int[arr.length - 1]; // Result array of size arr.length - 1
    
            for (int i = 0; i < arr.length - 1; i++) { // Iterate for each element except the last one
                int largest = arr[i+1]; // Assume the next element is the largest
                for (int j = i + 2; j < arr.length; j++) {
                    if (arr[j] > largest) {
                        largest = arr[j]; // Update largest if a larger element is found
                    }
                }
                result[i] = largest; // Store the largest element in result array
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};
            int[] result = findLargerOnRight(arr);
            System.out.println("Result array: " + java.util.Arrays.toString(result));
        }
    }
    
