import java.util.HashMap;
import java.util.Map;

public class Solution_13 {
    public int romanToInt(String s){
        
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int total = 0;
        int prevVal = 0;
        
        for(int i = s.length() - 1; i >= 0; i--){
            int currentVal = romanMap.get(s.charAt(i));
            if(currentVal < prevVal){
                total -= currentVal;
            } else{
                total += currentVal;
            }
            prevVal = currentVal;
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        Solution_13 solution = new Solution_13();
        
        System.out.println(solution.romanToInt("III"));    // Output: 3
        System.out.println(solution.romanToInt("LVIII"));  // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV"));// Output: 1994
    }
}
