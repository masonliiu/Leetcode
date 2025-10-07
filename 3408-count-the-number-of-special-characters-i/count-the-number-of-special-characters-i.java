class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> table = new HashMap<>();
        char[] arr = word.toCharArray();
        int count =0;

        Set<Character> nums = new HashSet<>();
        for (char s : arr) {
            nums.add(s);
        }
        for (char s : nums) {
            if (s == Character.toLowerCase(s)) {
                if (nums.contains(Character.toUpperCase(s))) {
                    if (!table.containsKey(Character.toLowerCase(s))) {
                        table.put(Character.toLowerCase(s), 1);
                        count++;
                    }
                }
            } else if (s == Character.toUpperCase(s)) {
                if (nums.contains(Character.toLowerCase(s))) {
                    if (!table.containsKey(Character.toLowerCase(s))) {
                        table.put(Character.toLowerCase(s), 1);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}