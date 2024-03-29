class Test {
    @org.junit.Test
    fun testCases() {
        val s = Solution()
        org.junit.Assert.assertEquals(23, s.maxSubArray(intArrayOf(5,4,-1,7,8)))
    }
}