import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    
    public static int[] computePrefixFunction(String s) {
        int n = s.length();
        int[] pi = new int[n];
        for (int i = 1; i < n; i++) {
            int j = pi[i - 1];
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = pi[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        return pi;
    }

    public static List<Integer> findBorders(String s) {
        int[] pi = computePrefixFunction(s);
        int n = s.length();
        List<Integer> borders = new ArrayList<>();

        int length = pi[n - 1]; 
        while (length > 0) {
            borders.add(length);
            length = pi[length - 1]; 
        }

        return borders;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();

        List<Integer> borders = findBorders(s);
        
        for (int border : borders) {
            System.out.print(border + " ");
        }
        
        scanner.close();
    }
}
