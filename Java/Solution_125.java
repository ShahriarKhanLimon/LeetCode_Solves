class Solution_125 {
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
    public static void main(String[] args) {
        Solution_125 sol = new Solution_125();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(sol.isPalindrome(s1)); // Output: true

        String s2 = "race a car";
        System.out.println(sol.isPalindrome(s2)); // Output: false

        String s3 = " ";
        System.out.println(sol.isPalindrome(s3)); // Output: true
    }
}