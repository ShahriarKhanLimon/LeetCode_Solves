class Solution_14(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        # Check for null or empty input
        if not strs:
            return ""

        # Initialize the prefix as the first string
        prefix = strs[0]

        # Iterate through the remaining strings
        for i in range(1, len(strs)):
            # While the current prefix is not a prefix of strs[i]
            while strs[i].find(prefix) != 0:
                # Reduce the prefix by one character from the end
                prefix = prefix[:-1]

                # If the prefix becomes empty, return an empty string
                if not prefix:
                    return ""

        return prefix  # Return the longest common prefix


# Driver code to test the function
if __name__ == "__main__":
    solution = Solution_14()

    # Example 1
    strs1 = ["flower", "flow", "flight"]
    print("Longest Common Prefix:", solution.longestCommonPrefix(strs1))  # Output: "fl"

    # Example 2
    strs2 = ["dog", "racecar", "car"]
    print("Longest Common Prefix:", solution.longestCommonPrefix(strs2))  # Output: ""

    # Example 3
    strs3 = []
    print("Longest Common Prefix:", solution.longestCommonPrefix(strs3))  # Output: ""
