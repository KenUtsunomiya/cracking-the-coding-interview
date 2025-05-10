import java.util.HashSet;
import java.util.Set;

class Solution {

    // Time: O(n)
    // Space: O(n)
    public boolean isUnique(String s) {
        // assume null string has unique characters
        if (s == null) {
            return true;
        }

        // assume unicode string
        Set<Character> charSet = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (charSet.contains(ch)) {
                return false;
            }
            charSet.add(ch);
        }
        return true;
    }

    // Time: O(n)
    // Space: O(1)
    public boolean isUniqueWithoutDataStructure(String s) {
        if (s == null) {
            return true;
        }

        // assume string consists of 'a' ~ 'z'
        int bits = 0;
        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            if ((bits & 1 << index) == 1) {
                return false;
            }
            bits |= 1 << index;
        }
        return true;
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        assert solution.isUnique(null) == true;
        assert solution.isUnique("") == true;
        assert solution.isUnique("a") == true;
        assert solution.isUnique("ab") == true;
        assert solution.isUnique("aza") == false;

        assert solution.isUniqueWithoutDataStructure(null) == true;
        assert solution.isUniqueWithoutDataStructure("") == true;
        assert solution.isUniqueWithoutDataStructure("a") == true;
        assert solution.isUniqueWithoutDataStructure("ab") == true;
        assert solution.isUniqueWithoutDataStructure("aza") == false;

        System.out.println("--------------------");
        System.out.println("All test cases passed!");
        System.out.println("--------------------");
    }
}
