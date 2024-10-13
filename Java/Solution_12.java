import java.util.LinkedHashMap;
import java.util.Map;

public class Solution_12 {
    public String intToRoman(int num) {
        
        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (num >= entry.getKey()) {
                result.append(entry.getValue());
                num -= entry.getKey();
            }
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution_12 solution = new Solution_12();
        
        System.out.println(solution.intToRoman(3749));    // Output: "MMMDCCXLIX"
        System.out.println(solution.intToRoman(58));  // Output: "LVIII"
        System.out.println(solution.intToRoman(1994));// Output: "MCMXCIV"
    }
}
