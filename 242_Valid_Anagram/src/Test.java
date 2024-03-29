import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testCases() {
        Solution s = new Solution();

        Assert.assertTrue(s.isAnagram("anagram", "nagaram"));
    }
}
