class Solution:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        n = len(s)
        if n == 0:
            return True
        if n%2 != 0:
            return False

        stack = []
        left_parenthesis_list = ['(', '{', '[']
        right_parenthesis_list = [')', '}', ']']
        for char in s:
            if char in left_parenthesis_list:
                stack.append(char)
            elif char in right_parenthesis_list:
                if len(stack) == 0:
                    return False
                left_char = stack.pop()
                if left_parenthesis_list.index(left_char) != right_parenthesis_list.index(char):
                    return False

        if len(stack) == 0:
            return True
        else:
            return False


if __name__ == "__main__":
    source = "(((({{{(){{[[]]()}}}}}){}))[])"
    source = "]]]}"
    # source = ""
    solution = Solution()
    print(solution.isValid(source))
