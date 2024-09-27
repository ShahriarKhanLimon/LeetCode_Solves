class Consistent_Strings {
    public boolean isPalindrome(String s) {
        StringBuilder normalized = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                normalized.append(Character.toLowerCase(c));
            }
        }

        String normalizedStr = normalized.toString();

        int left = 0;
        int right = normalized.length() - 1;

        while(left < right){
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class main_isPalindromeCheck{
    public static void main(String[] args) {
        Consistent_Strings sol = new Consistent_Strings();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(sol.isPalindrome("race a car"));
        System.out.println(sol.isPalindrome(" "));

    }
}