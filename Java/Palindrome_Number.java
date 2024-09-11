class Palindrome_Number {
    public boolean isPalindrome(int x) {
     if (x < 0 || (x % 10 == 0 && x != 0)){
     return false;  
    }
    int reversedHalf = 0;

    while(x > reversedHalf){
        reversedHalf = reversedHalf * 10 + x % 10;
        x /= 10;
    }
    return x == reversedHalf || x == reversedHalf / 10;
    }
    public static void main(String[] args) {
        Palindrome_Number checker = new Palindrome_Number();

        // Test cases
        int[] testCases = {121, -121, 10, 12321, 123456};
        for (int num : testCases) {
            boolean result = checker.isPalindrome(num);
            System.out.println("Is " + num + " a palindrome? " + result);
        }
    }

}