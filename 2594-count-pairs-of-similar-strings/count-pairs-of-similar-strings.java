class Solution {
    public int similarPairs(String[] words) {
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (String s : words) {
            int x = 0;
            for (char c : s.toCharArray()) {
                x |= 1 << (c - 'a');
            }
            pairs += map.getOrDefault(x, 0);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return pairs;
    }
}
