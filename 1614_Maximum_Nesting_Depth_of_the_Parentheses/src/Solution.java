public class Solution {
    public int maxDepth(String s) {
        int current = 0;
        int max = 0;

        for (char c: s.toCharArray()) {
            if (c == '(') {
                current++;
                max = Math.max(current, max);
            } else if (c == ')') {
                current--;
            }
        }

        return max;
    }
}
