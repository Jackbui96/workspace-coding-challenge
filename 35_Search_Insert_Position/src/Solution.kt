class Solution {
    /**
     * Link: https://leetcode.com/problems/search-insert-position/
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     *
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     *
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     */

    fun searchInsert_Ologn(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var pivot = (left + right) / 2

        while (left <= right) {
            if (nums[pivot] == target) return pivot
            if (nums[pivot] < target) {
                left = pivot + 1
            } else if (nums[pivot] > target) {
                right = pivot - 1
            }
            pivot = (left + right) / 2
        }

        return left
    }

    fun searchInsert_On(nums: IntArray, target: Int): Int {
        nums.forEach { number ->
            if (target <= number) {
                return nums.indexOf(number)
            }
        }
        return nums.size
    }
}