import java.util.HashSet;
import java.util.Set;

public class Solution_202 {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int number){
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            totalSum += digit * digit;
            number /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Solution_202 sol = new Solution_202();

        // Test Case 1
        int n1 = 19;
        System.out.println(sol.isHappy(n1)); // Output: true

        // Test Case 2
        int n2 = 2;
        System.out.println(sol.isHappy(n2)); // Output: false
    }
}
