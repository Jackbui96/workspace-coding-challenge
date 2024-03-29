class Test {
    @org.junit.Test
    fun testCases() {
        val s = Solution()
        org.junit.Assert.assertEquals(4, s.searchInsert_On(intArrayOf(1, 3, 5, 6), 7))
        org.junit.Assert.assertEquals(0, s.searchInsert_On(intArrayOf(-5000, -4999), -5365))

        org.junit.Assert.assertEquals(2, s.searchInsert_Ologn(intArrayOf(1, 3, 5, 6), 5))
        org.junit.Assert.assertEquals(1, s.searchInsert_Ologn(intArrayOf(1, 3, 4, 5, 6), 3))
        org.junit.Assert.assertEquals(3, s.searchInsert_Ologn(intArrayOf(1, 3, 4, 5, 6), 5))
//        org.junit.Assert.assertEquals(1, s.searchInsert_Ologn(intArrayOf(1, 3, 5, 6), 2))
//        org.junit.Assert.assertEquals(2, s.searchInsert_Ologn(intArrayOf(1, 3, 5, 6), 5))
    }
}