/*Day 10 of 30 🗓

Problem : Group Anagrams
You are given an array of strings strs[]. Your task is to group all the strings that are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input :
strs[] = ["eat", "tea", "tan", "ate", "nat", "bat"]

Output :
[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
*/
import java.util.*;
public class day10 {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and corresponding anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string into a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // Convert the sorted character array back to a string
            String sortedStr = new String(charArray);

            // If the sorted string is not in the map, add it with a new list
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }

            // Add the original string to the corresponding list
            anagramMap.get(sortedStr).add(str);
        }

        // Return all grouped anagrams as a list of lists
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}

