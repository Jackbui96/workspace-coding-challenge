public class Test {
    @org.junit.Test
    public void testCases() {
        Solution s = new Solution();
        System.out.println(s.exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        }, "ABCB"));
    }
}
