import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int storage = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - k + 1; i++) {
            if (nums[i + k - 1] - nums[i] < storage) {
                storage = nums[i + k - 1] - nums[i];
            }
        }
        return storage;

    }
}