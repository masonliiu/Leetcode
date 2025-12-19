class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        long count = 0;
        long left = 0, right = 0, num = 0;
        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }
        while (right < nums.length || left > right) {
            if (nums[(int)right] == max) {
                count++;
            }

            while (count >= k) {
                if (nums[(int)left] == max) {
                    count--;
                }
                left++;
                num += nums.length - right;
            }
            right++;
        }

        return num;
    }
}