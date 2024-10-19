class Solution_125(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        normalized = []
        
        for char in s:
            if char.isalnum():
                normalized.append(char.lower())
                
        left, right = 0, len(normalized) - 1
        
        while left < right:
            if normalized[left] != normalized[right]:
                return False
            left += 1
            right -= 1
            
        return True
    
if __name__ == "__main__":
    solution = Solution_125()
    
    s1 = "A man, a plan, a canal: Panama"
    s2 = "race a car"
    s3 = " "

    print(solution.isPalindrome(s1)) # Expected Output: true
    print(solution.isPalindrome(s2)) # Expected Output: false
    print(solution.isPalindrome(s3)) # Expected Output: true