
public class Test {
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
    }
}
