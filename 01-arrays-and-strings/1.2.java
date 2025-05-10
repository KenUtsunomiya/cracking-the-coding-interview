class Solution {

    // Time: O(n)
    // Space: O(1)
    boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCnt1 = new int[128]; // Assume a string consists of ASCII characters
        int[] charCnt2 = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            int chIdx1 = s1.charAt(i);
            int chIdx2 = s2.charAt(i);
            charCnt1[chIdx1] += 1;
            charCnt2[chIdx2] += 1;
        }

        for (int i = 0; i < 128; i++) {
            if (charCnt1[i] != charCnt2[i]) {
                return false;
            }
        }

        return true;
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        assert solution.isPermutation("", "") == true;
        assert solution.isPermutation("abc", "abc") == true;
        assert solution.isPermutation("abc", "cba") == true;
        assert solution.isPermutation("abc", "abcd") == false;
        assert solution.isPermutation("abc", "ab") == false;
        assert solution.isPermutation("abc", "abcc") == false;
        assert solution.isPermutation("abc", "aabbcc") == false;
        assert solution.isPermutation("abc", "aabb") == false;

        System.out.println("--------------------");
        System.out.println("All test cases passed!");
        System.out.println("--------------------");
    }
}
