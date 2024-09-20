/*Problem : Longest Common Prefix
You are given an array of strings strs[], consisting of lowercase letters. Your task is to find the longest common prefix shared among all the strings. If there is no common prefix, return an empty string "".

Input :
An array of strings strs[] where each string consists of lowercase English letters.
Example: strs[] = ["flower", "flow", "flight"]

Output :
* A string representing the longest common prefix. If no common prefix exists, return an empty string "".
Example: "fl"
*/

public class day9 {
    
        public static String longestCommonPrefix(String[] strs) {
            // If the array is empty, return an empty string
            if (strs == null || strs.length == 0) {
                return "";
            }
    
            // Start with the first string as the potential common prefix
            String prefix = strs[0];
    
            // Iterate over the rest of the strings
            for (int i = 1; i < strs.length; i++) {
                // Reduce the prefix size until it matches the start of the current string
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    // If the prefix becomes an empty string, there is no common prefix
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
    
            return prefix;
        }
    
        public static void main(String[] args) {
            String[] strs = {"flower", "flow", "flight"};
            System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
        }
    }

