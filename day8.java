/*Problem : Reverse a String Word by Word
You are given a string s that consists of multiple words separated by spaces. Your task is to reverse the order of the words in the string. Words are defined as sequences of non-space characters. The output string should not contain leading or trailing spaces, and multiple spaces between words should be reduced to a single space.

Input :
A string s of length n (1 ≤ n ≤ 10^4) consisting of letters, digits, punctuation, and spaces.
Example : "the sky is blue"

Output :
* A string where the words in s are reversed, with a single space separating the words, and no leading or trailing spaces.
Example: "blue is sky the"
*/
public class day8{
        public static String reverseWords(String s) {
            // Step 1: Trim the string to remove leading and trailing spaces
            s = s.trim();
            
            // Step 2: Split the string by one or more spaces
            String[] words = s.split("\\s+");
            
            // Step 3: Reverse the array of words
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i != 0) {
                    reversed.append(" ");
                }
            }
            
            // Step 4: Return the result
            return reversed.toString();
        }
    
        public static void main(String[] args) {
            String s = "  the   sky   is   blue  ";
            System.out.println(reverseWords(s));  // Output: "blue is sky the"
        }
    }

