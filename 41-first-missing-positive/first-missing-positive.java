class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : nums) {
            list.add(x);
        }

        list.removeIf(x -> x <= 0);
        if (!list.contains(1)) {
            return 1;
        }
        int lowest = 1;
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);

            if (current == lowest) {
                continue;
            }
            if (current != lowest + 1) {
                return lowest + 1;
            }
            lowest = current;
        }
        
        return list.get(list.size() - 1) + 1;
    }
}