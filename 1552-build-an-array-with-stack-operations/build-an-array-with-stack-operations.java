class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> stack = new ArrayList<>();
        List<Integer> stack2 = new ArrayList<>();

        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
            if (target[j] != i) {
                stack.add("Push");
                stack.add("Pop");
                continue;
            }
            stack2.add(i);
            stack.add("Push");
            j++;

            if (j == target.length) return stack;
        }
        return stack;
    }
}