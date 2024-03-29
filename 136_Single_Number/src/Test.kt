class Test {
    @org.junit.Test
    fun testCases() {
        val s = Solution()
        org.junit.Assert.assertEquals(3, s.singleNumber(intArrayOf( 1, 2, 3, 2, 1)))
        org.junit.Assert.assertEquals(4, s.singleNumber(intArrayOf( 4, 1, 2, 1, 2)))
    }
}