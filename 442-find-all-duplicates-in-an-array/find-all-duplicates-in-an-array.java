class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> storage = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                storage.add(nums[i]);
            }
        }
        return storage;
    }
}