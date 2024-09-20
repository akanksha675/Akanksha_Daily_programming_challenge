/*Day 12 of 30 🗓

Problem : Valid Parentheses with Multiple Types
You are given a string s consisting of different types of parentheses: (), {}, and []. Your task is to determine whether the given string is valid.

Input : s = "[{()}]"

Output : true
*/
import java.util.*;
public class day12 {
   

    public static boolean isValid(String s) {
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Map for matching pairs
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');

        // Traverse the string
        for (char c : s.toCharArray()) {
            // If it's a closing bracket, check if it matches the top of the stack
            if (matchingBrackets.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                // If it doesn't match the corresponding opening bracket, return false
                if (topElement != matchingBrackets.get(c)) {
                    return false;
                }
            } 
            // If it's an opening bracket, push it onto the stack
            else if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
        }

        // If the stack is empty, all opening brackets have been matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isValid(s));  // Output: true
    }
}

