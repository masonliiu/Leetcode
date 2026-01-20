class Solution {
    public int[] transformArray(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] % 2 == 0) nums[x] = 0;
            if (nums[x] % 2 != 0) nums[x] = 1;
        }
        Arrays.sort(nums);
        return nums;
    }
}