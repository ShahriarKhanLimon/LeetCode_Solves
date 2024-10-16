public class Solution_6 {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution_6 solution = new Solution_6();

        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        String s3 = "A";
        int numRows3 = 1;

        System.out.println(solution.convert(s1, numRows1));  // Output: "PAHNAPLSIIGYIR"
        System.out.println(solution.convert(s2, numRows2));  // Output: "PINALSIGYAHRPI"
        System.out.println(solution.convert(s3, numRows3));  // Output: "A"
    }
}
