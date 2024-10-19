import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int[] calculatePrefixArray(String input) {
        int length = input.length();
        int[] prefixArray = new int[length];
        for (int i = 1; i < length; i++) {
            int j = prefixArray[i - 1];
            while (j > 0 && input.charAt(i) != input.charAt(j)) {
                j = prefixArray[j - 1];
            }
            if (input.charAt(i) == input.charAt(j)) {
                j++;
            }
            prefixArray[i] = j;
        }
        return prefixArray;
    }

    public static List<Integer> extractBorders(String input) {
        int[] prefixArray = calculatePrefixArray(input);
        int length = input.length();
        List<Integer> borders = new ArrayList<>();

        int borderLength = prefixArray[length - 1]; 
        while (borderLength > 0) {
            borders.add(borderLength);
            borderLength = prefixArray[borderLength - 1]; 
        }

        return borders;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        List<Integer> borders = extractBorders(input);
        
        for (int border : borders) {
            System.out.print(border + " ");
        }
        
        scanner.close();
    }
}
