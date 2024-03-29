import kotlin.math.max

class Solution {
    /**
     * Link: https://leetcode.com/problems/maximum-subarray/
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest
     * sum and return its sum.
     *
     * A subarray is a contiguous part of an array.
     *
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     */

    fun maxSubArray(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var currentSum = 0
        var maxSum = 0

        nums.forEach { value ->
            currentSum += value
            if (currentSum < value) {
                currentSum = value
            }
            maxSum = Math.max(currentSum, maxSum)
        }

        return maxSum
    }
}