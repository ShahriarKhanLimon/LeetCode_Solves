public class Solution_392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int sPointer = 0, tPointer = 0;

        while (tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                if (sPointer == s.length()) {
                    return true;
                }
            }
            tPointer++;
        }

        return false;
    }

    public static void main(String[] args){
        Solution_392 sol = new Solution_392();

        String s1 = "abc";
        String t1 = "ahbgdc";
        
        System.out.println(sol.isSubsequence(s1, t1)); // Output: True

        String s2 = "axc";
        String t2 = "ahbgdc";
        
        System.out.println(sol.isSubsequence(s2, t2));   // Output: False
    }
}
