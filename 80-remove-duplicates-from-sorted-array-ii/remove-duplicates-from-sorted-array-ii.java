class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[fast-2]) {
                nums[fast] = nums[i];
                fast++;
            }
        }
        return fast;
    }
}