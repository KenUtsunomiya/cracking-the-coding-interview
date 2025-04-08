import java.util.HashSet;
import java.util.Set;

public class Solution {

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
