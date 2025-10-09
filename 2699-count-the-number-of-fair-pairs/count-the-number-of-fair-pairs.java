class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLessEqual(nums, upper) - countLessEqual(nums, lower - 1);

    }
    private long countLessEqual(int[]nums, int limit) {
        long count = 0;
        int left = 0, right = nums.length -1;

        while (left < right) {
            if(nums[left] + nums[right] <= limit) {
                count += (right-left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}