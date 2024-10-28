import java.util.ArrayList;
import java.util.List;

public class Solution_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
    public static void main(String[] args){
        Solution_54 sol = new Solution_54();
    
        int[][] matrix1={
            {1,2,3},{4,5,6},{7,8,9}
        };
        List<Integer> result1 = sol.spiralOrder(matrix1);
        System.out.println(result1); // Output: [1,2,3,6,9,8,7,4,5]
        
        int[][] matrix2={
            {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };

        List<Integer> result2 = sol.spiralOrder(matrix2);
        System.out.println(result2); // Output: [1,2,3,4,8,12,11,10,9,5,6,7]
    }
}
