/*Day 11 of 30 🗓

Problem : Permutations of a String
You are given a string s. Your task is to generate and return all possible permutations of the characters in the string. A permutation is a rearrangement of the characters in the string, and each character must appear exactly once in every permutation. If there are duplicate characters in the string, the resulting permutations should also be unique (i.e., no repeated permutations).

Input : "abc"

Output : ["abc", "acb", "bac", "bca", "cab", "cba"]
*/
import java.util.*;
public class day11 {

    public static List<String> findPermutations(String s) {
        List<String> result = new ArrayList<>();
        permute(s.toCharArray(), 0, result);
        return result;
    }

    private static void permute(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
        } else {
            Set<Character> seen = new HashSet<>(); // To handle duplicates
            for (int i = index; i < chars.length; i++) {
                if (seen.add(chars[i])) {  // Only proceed if this character hasn't been used in this position
                    swap(chars, index, i);
                    permute(chars, index + 1, result);
                    swap(chars, index, i);  // Backtrack
                }
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = findPermutations(s);
        System.out.println(permutations);
    }
}

