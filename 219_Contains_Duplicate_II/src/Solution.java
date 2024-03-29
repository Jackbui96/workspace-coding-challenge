import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums.length == 0) return false;

        HashMap<Integer, Integer> elementToNearbyIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (elementToNearbyIndex.containsKey(nums[i])
                    && Math.abs(i - elementToNearbyIndex.get(nums[i])) <= k) {
                return true;
            }
            elementToNearbyIndex.put(nums[i], i);
        }
        return false;
    }
}
