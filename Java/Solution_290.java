import java.util.HashMap;

public class Solution_290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else{
                if (wordToChar.containsKey(word) && wordToChar.get(word) != c) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution_290 solution = new Solution_290();

        String pattern1 = "abba", s1 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern1, s1)); // true

        String pattern2 = "abba", s2 = "dog cat cat fish";
        System.out.println(solution.wordPattern(pattern2, s2)); // false

        String pattern3 = "aaaa", s3 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern3, s3)); // false
    }
}
