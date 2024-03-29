import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testCases() {
        Solution s = new Solution();
        Assert.assertEquals("fl", s.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", s.longestCommonPrefix(new String[]{"", "flow", "flight"}));
        Assert.assertEquals("", s.longestCommonPrefix(new String[]{}));
    }
}
