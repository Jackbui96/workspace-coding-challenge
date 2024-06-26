class Solution {
    /**
     * Link: https://leetcode.com/problems/single-number/
     * Given a non-empty array of integers nums, every element appears twice except for one.
     * Find that single one.
     *
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * Input: nums = [2,2,1]
     * Output: 1
     */

    fun singleNumber(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]

        var unique = nums[0]
        val keyValueMap: HashMap<Int, Boolean> = HashMap()

        nums.forEach { value ->
            keyValueMap[value] = keyValueMap.contains(value)
        }

        keyValueMap.forEach { (key, value) ->
            if (!value) unique = key
        }

        return unique
    }
}
