class Test {
    @org.junit.Test
    fun testCases() {
        val s = Solution()
        org.junit.Assert.assertEquals("acdb", s.removeDuplicateLetters("cbacdcbc"))
    }
}