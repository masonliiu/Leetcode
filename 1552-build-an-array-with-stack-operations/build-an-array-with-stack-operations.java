import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> stack = new ArrayList<>();
        List<Integer> stack2 = new ArrayList<>();

        int j = 0; 

        for (int i = 1; i <= n && j < target.length; i++) {
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
