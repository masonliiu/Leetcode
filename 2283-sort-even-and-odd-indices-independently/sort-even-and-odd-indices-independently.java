class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                odd.add(nums[i]);
            }
        }

        Collections.sort(odd);
        Collections.reverse(odd);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            }
        }
        Collections.sort(even);

        for (int i = 1, x = 0; x < odd.size() && i < nums.length; i+=2, x++) {
            nums[i] = odd.get(x);
        }
        for (int i = 0, x = 0; x < even.size() && i < nums.length; i+=2, x++) {
            nums[i] = even.get(x);
        }
        return nums;
    }
}