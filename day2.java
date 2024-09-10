
/*Problem: Find the missing number
You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input :
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output :
Return the missing integer from the array.
Example: Missing Number : 3
*/

public class day2 {
        public static int findMissingNumber(int[] arr, int n) {
            // Calculate the sum of the first n natural numbers
            int Sum = n * (n + 1) / 2;
            
            // Calculate the sum of the elements in the array
            int arraySum = 0;
            for (int num : arr) {
                arraySum += num;
            }
            
            // The missing number is the difference between the two sums
            return Sum - arraySum;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2,3,4,5};  // Example array
            int n = arr.length+1;  // Total numbers should be from 1 to 5
            System.out.println("Missing number: " + findMissingNumber(arr, n));  // Output: 3
        }
    }

