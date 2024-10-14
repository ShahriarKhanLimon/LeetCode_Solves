import java.util.Scanner;
public class Solution_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        String[] words = s.split(" ");

        return words[words.length - 1].length();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Solution_58 sol = new Solution_58();

        System.out.println("Enter a string: ");

        String input = sc.nextLine();

        int result = sol.lengthOfLastWord(input);

        System.err.println("Length of the last word: " + result);

        sc.close();
    }
}
