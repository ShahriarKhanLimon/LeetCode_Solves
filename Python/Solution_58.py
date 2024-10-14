Class Solution_58(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.strip()
        
        words = s.split()
        
        return len(words[-1])
    
if __name__ == "__main__":
    solution = Solution_58()
    
    test_cases = [
        "Hello World",                  
        "   fly me   to   the moon  ",    
        "luffy is still joyboy"
    ]
    
    for s in test_cases:
        print(f"Input: '{s}'")
        print(f"Output: {solution.lengthOfLastWord(s)}\n")