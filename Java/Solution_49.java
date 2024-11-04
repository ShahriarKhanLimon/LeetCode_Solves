import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Solution_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Solution_49 solution = new Solution_49();

        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Input: " + Arrays.toString(strs1));
        List<List<String>> result1 = solution.groupAnagrams(strs1);
        System.out.println("Grouped Anagrams: " + result1);

        String[] strs2 = {""};
        System.out.println("Input: " + Arrays.toString(strs2));
        List<List<String>> result2 = solution.groupAnagrams(strs2);
        System.out.println("Grouped Anagrams: " + result2);

        String[] strs3 = {"a"};
        System.out.println("Input: " + Arrays.toString(strs3));
        List<List<String>> result3 = solution.groupAnagrams(strs3);
        System.out.println("Grouped Anagrams: " + result3);
    }
}
