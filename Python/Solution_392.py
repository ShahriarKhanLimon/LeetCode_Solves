class Solution_392(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) == 0:
            return True
        
        sPointer, tPointer = 0, 0
        
        while tPointer < len(t) :
            if s[sPointer] == t[tPointer]:
                sPointer += 1
                if sPointer == len(s):
                    return True
            tPointer += 1
            
        return False

# Driver code to test the function
if __name__ == "__main__":
    solution = Solution_392()

    # Example 1
    s1 = "abc"
    t1 = "ahbgdc"
    
    print(solution.isSubsequence(s1, t1))  # Output: True
    
    # Example 2
    s2 = "axc"
    t2 = "ahbgdc"
    
    print(solution.isSubsequence(s1, t1))  # Output: False
