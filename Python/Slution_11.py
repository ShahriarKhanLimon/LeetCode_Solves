class Solution_11(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left ,right = 0, len(height) - 1
        maxArea = 0

        while left < right:
            width = right - left
            minHeight = min(height[left], height[right])
            area = width * minHeight

            maxArea = max(maxArea, area)

            if (height[left] < height[right]):
                left += 1
            else:
                right -= 1
        return maxArea
        
# Driver code to test the function
if __name__ == "__main__":
    sol = Solution_11()

    # Example 1
    height1 = [1, 8, 6, 2, 5, 4, 8, 3, 7]
    result1 = sol.maxArea(height1)
    print(result1) # Output: 49
    
    # Example 2
    height2 = [1, 1]
    result2 = sol.maxArea(height2)
    print(result2) # Output: 1