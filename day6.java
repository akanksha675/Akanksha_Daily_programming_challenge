/*You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero. A subarray is defined as a contiguous part of the array, and you must return the starting and ending indices of each subarray.

Example

Input: [1, 2, 3, 3, -1, 2]

Output: [(0, 2), (2,3)]
*/
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    
    public class day6 {
        public static List<int[]> findSubarraysWithZeroSum(int[] arr) {
            List<int[]> result = new ArrayList<>();
            HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
            int currentSum = 0;
    
            // Traverse the array
            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
    
                // If subarray from 0 to i has sum 0
                if (currentSum == 0) {
                    result.add(new int[] {0, i});
                }
    
                // If current_sum has been seen before
                if (sumMap.containsKey(currentSum)) {
                    List<Integer> indices = sumMap.get(currentSum);
                    for (Integer start : indices) {
                        result.add(new int[] {start + 1, i});
                    }
                }
    
                // Add the current index to the list of indices for this sum
                sumMap.computeIfAbsent(currentSum, k -> new ArrayList<>()).add(i);
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 3, -1, 2};
            List<int[]> subarrays = findSubarraysWithZeroSum(arr);
    
            // Print the result
            for (int[] subarray : subarrays) {
                System.out.println("Subarray from index " + subarray[0] + " to " + subarray[1]);
            }
        }
    }
     

