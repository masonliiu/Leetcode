class Solution {
    public int removeElement(int[] nums, int val) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++; 
            }
            if(i + 1 == nums.length) return j;
        }
        return 0; 
    }
}