import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testCases() {
        JavaSolution s = new JavaSolution();
        Assert.assertFalse(s.isPalindrome(10));
        Assert.assertFalse(s.isPalindrome(-10));
        Assert.assertFalse(s.isPalindrome(-101));

        Assert.assertTrue(s.isPalindrome(121));
        Assert.assertTrue(s.isPalindrome(1221));
        Assert.assertTrue(s.isPalindrome(0));
        Assert.assertTrue(s.isPalindrome(404));
    }
}
