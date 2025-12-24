class Solution {
    public int removeDuplicates(int[] nums) {
        int storage = -101;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == storage) {
                nums[i] = 101;
                x++;
                continue;
            }
            storage = nums[i];
        }
        Arrays.sort(nums);
        return nums.length - x;
    }
}