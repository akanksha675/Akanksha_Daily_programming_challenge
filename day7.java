/*Problem : Trapping Rain Water
You are given an array height[] of non-negative integers where each element represents the height of a bar in a histogram-like structure. These bars are placed next to each other, and the width of each bar is 1 unit. When it rains, water gets trapped between the bars if there are taller bars on both the left and right of the shorter bars. The task is to calculate how much water can be trapped between these bars after the rain.

Input :
An integer array height[] where each element represents the height of a bar in the histogram.
Example : 
height[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]

Output :
* An integer representing the total units of water that can be trapped between the bars.
Example
Output: 6
*/
public class day7 {

        public static int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }
    
            int left = 0; // Pointer to traverse from the left
            int right = height.length - 1; // Pointer to traverse from the right
            int leftMax = 0; // Maximum height encountered from the left
            int rightMax = 0; // Maximum height encountered from the right
            int totalWater = 0; // Total water trapped
    
            while (left < right) {
                if (height[left] < height[right]) {
                    // If the left bar is smaller than the right bar
                    if (height[left] >= leftMax) {
                        // Update the left maximum height
                        leftMax = height[left];
                    } else {
                        // Calculate trapped water at the left position
                        totalWater += leftMax - height[left];
                    }
                    left++; // Move the left pointer to the right
                } else {
                    // If the right bar is smaller or equal to the left bar
                    if (height[right] >= rightMax) {
                        // Update the right maximum height
                        rightMax = height[right];
                    } else {
                        // Calculate trapped water at the right position
                        totalWater += rightMax - height[right];
                    }
                    right--; // Move the right pointer to the left
                }
            }
    
            return totalWater;
        }
    
        public static void main(String[] args) {
            int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            System.out.println("Total water trapped: " + trap(height)); // Output: 6
        }
    }

