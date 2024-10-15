class Solution_151(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.strip()
        
        words = s.split()
        
        words.reverse()
        
        return ' '.join(words)
    
if __name__ == "__main__":
    solution = Solution_151()
    
    test_cases = [
        "the sky is blue",                  
        "  hello world  ",    
        "a good   example"
    ]
    
    for s in test_cases:
        print(f"Input: {s}")
        print(f"Output: {solution.reverseWords(s)}\n")