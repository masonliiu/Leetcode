class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();
        int count =0;

        Set<Character> nums = new HashSet<>();
        Set<Character> ars = new HashSet<>();
        for (char s : arr) {
            nums.add(s);
        }
        for (char s : nums) {
            if (s == Character.toLowerCase(s)) {
                if (nums.contains(Character.toUpperCase(s))) {
                    if (!ars.contains(Character.toLowerCase(s))) {
                        ars.add(Character.toLowerCase(s));
                        count++;
                    }
                }
            } else if (s == Character.toUpperCase(s)) {
                if (nums.contains(Character.toLowerCase(s))) {
                    if (!ars.contains(Character.toLowerCase(s))) {
                        ars.add(Character.toLowerCase(s));
                        count++;
                    }
                }
            }
        }
        return count;
    }
}