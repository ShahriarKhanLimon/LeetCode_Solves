import java.util.HashMap;
import java.util.Map;

public class Solution_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) {
                    return false;
                }
            } else{
                mapST.put(charS, charT);
            }

            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) {
                    return false;
                }
            } else{
                mapST.put(charT, charS);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Solution_205 solution = new Solution_205();

        String s1 = "egg", t1 = "add";
        System.out.println(solution.isIsomorphic(s1, t1)); // true

        String s2 = "foo", t2 = "bar";
        System.out.println(solution.isIsomorphic(s2, t2)); // false

        String s3 = "paper", t3 = "title";
        System.out.println(solution.isIsomorphic(s3, t3)); // true
    }
}
