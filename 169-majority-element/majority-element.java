class Solution {
    public int majorityElement(int[] nums) {
        int max = nums.length / 2;
        int maximum = 0;
        int max2 = 0;
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int x : nums) {
            if (!list.containsKey(x)) {
                list.put(x, 1);
            } else {
                list.replace(x, list.get(x) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> y : list.entrySet()) {
            if (y.getValue() > maximum) {
                maximum = y.getValue();
                max2 = y.getKey();
            }
        }
        return max2;
    }
}