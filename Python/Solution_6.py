class Solution_6(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        # Edge case: if only one row or string length is less than the number of rows
        if numRows == 1 or numRows >= len(s):
            return s
        
        # Create an array of StringBuilder-like objects (lists) to hold the characters of each row
        rows = [''] * numRows
        
        currentRow = 0  # Start at the top row
        goingDown = False  # Variable to track direction
        
        # Traverse each character in the string
        for char in s:
            rows[currentRow] += char  # Append character to the current row
            
            # Change direction when hitting the top or bottom row
            if currentRow == 0 or currentRow == numRows - 1:
                goingDown = not goingDown
            
            # Update the row index (move up or down)
            currentRow += 1 if goingDown else -1
        
        # Combine all rows into one result string
        return ''.join(rows)
    
if __name__ == "__main__":
    solution = Solution_6()
    
    s = "PAYPALISHIRING"
    numRows = 3
    result = solution.convert(s, numRows)
    print("Input:", s)
    print("Number of Rows:", numRows)
    print("Converted Zigzag Output:", result)
    # Expected Output: "PAHNAPLSIIGYIR"