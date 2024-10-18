class Solution_28(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        return haystack.find(needle)
    
if __name__ == "__main__":
    solution = Solution_28()
    
    haystack1 = "sadbutsad"
    needle1 = "sad"
    haystack2 = "leetcode"
    needle2 = "leeto"

    print("Converted Zigzag Output:", solution.strStr(haystack1, needle1)) # Expected Output: 0
    print("Converted Zigzag Output:", solution.strStr(haystack2, needle2)) # Expected Output: -1