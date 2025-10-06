class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        return nums;
    }
}