import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testCases() {
        Solution s = new Solution();

        ListNode t1 = new ListNode(3);
        t1.next = new ListNode(2);
        t1.next.next = new ListNode(0);
        t1.next.next.next = new ListNode(-4);
        t1.next.next.next.next = t1.next.next;

        Assert.assertTrue(s.hasCycle(t1));
    }
}
