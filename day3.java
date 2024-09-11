/*Problem: Find the duplicate number

You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.

Input:

An integer array arr of size n+1, where each element is an integer in the range [1, n].

Example: arr = [3, 1, 3, 4, 2] 
*/
import java.util.Scanner;
public class day3{
    public int findduplicate(int[] nums){
        int i=0;
        while(nums[i]>=0){
            int temp=nums[i];
            nums[i]=-1;
            i=temp;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        // Declaring the array with the given size
        int[] nums = new int[n];
        
        // Taking input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Create an instance of the class to call the non-static method
        day3 obj = new day3();
        // Call the method using the instance and pass the nums array
        System.out.println(obj.findduplicate(nums));
    }
}
