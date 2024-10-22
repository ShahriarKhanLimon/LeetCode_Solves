class Solution_167(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        left, right = 0, len(numbers) - 1
        
        while left < right:
            sum  = numbers[left] + numbers[right]

            if (sum == target):
                return [left + 1, right + 1]
            elif (sum < target):
                left += 1
            else:
                right -= 1
                    
        return [-1, -1]  # This line is never reached because the problem guarantees exactly one solution

# Driver code to test the function
if __name__ == "__main__":
    sol = Solution_167()

    # Example 1
    numbers1 = [2, 7, 11, 15]
    target1 = 9
    result1 = sol.twoSum(numbers1, target1)
    
    print(f"[{result1[0]}, {result1[1]}]") # Output: Output: [1,2]
    
    # Example 2
    numbers2 = [2, 3, 4]
    target2 = 6
    result2 = sol.twoSum(numbers2, target2)
    
    print(f"[{result2[0]}, {result2[1]}]") # Output: Output: [1,2]
    
    # Example 3
    numbers3 = [-1, 0]
    target3 = -1
    result3 = sol.twoSum(numbers3, target3)
    
    print(f"[{result3[0]}, {result3[1]}]") # Output: Output: [1,2]
