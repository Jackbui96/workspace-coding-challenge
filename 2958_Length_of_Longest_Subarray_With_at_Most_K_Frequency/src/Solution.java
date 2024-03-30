import java.util.HashMap;

public class Solution {

    public int maxSubarrayLength(int[] nums, int k) {

        int leftPointer = 0;
        int rightPointer = 0;
        int max = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1);
            } else {
                frequency.put(num, frequency.get(num) + 1);
                int count = rightPointer - leftPointer;
                max = Math.max(max, count);

                while (frequency.get(num) > k) {
                    frequency.put(nums[leftPointer], frequency.get(nums[leftPointer]) - 1);
                    leftPointer++;
                }
            }
            rightPointer++;
        }

        int count = rightPointer - leftPointer;
        max = Math.max(max, count);

        return max;
    }

}
