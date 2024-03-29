public class Solution {
    public boolean hasCycle(ListNode head) {
        // If there is no response
        if (head == null) return false;
        // False if there is only 1 node
        if (head.next == null) return false;

        ListNode oneStep = head;
        ListNode twoStep = head.next.next;

        while (twoStep != null && twoStep.next != null) {
            if (oneStep == twoStep) return true;
            else {
                oneStep = oneStep.next;
                twoStep = twoStep.next.next;
            }
        }
        return false;
    }
}
