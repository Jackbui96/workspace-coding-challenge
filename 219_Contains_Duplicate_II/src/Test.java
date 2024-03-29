import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testCases() {
        Solution s = new Solution();

        Assert.assertTrue(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}
