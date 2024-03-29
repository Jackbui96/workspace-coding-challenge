import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> allocator = new PriorityQueue<Integer>(
                intervals.length,
                (a, b) -> a - b);

        Arrays.sort(
                intervals,
                (a, b) -> a[0] - b[0]);

        for (int[] i : intervals) {
            System.out.println("Want to see i: " + Arrays.toString(i));
        }

        allocator.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= allocator.peek()) {
                allocator.poll();
            }
            allocator.add(intervals[i][1]);
        }

        return allocator.size();
    }
}
