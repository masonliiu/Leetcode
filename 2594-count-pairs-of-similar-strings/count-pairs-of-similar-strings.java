class Solution {
    public int similarPairs(String[] words) {
        int pairs = 0;
        int left = 0, right = 1;
        while (left < right && left < words.length-1) {
            List<Character> l = words[left].chars()
                .mapToObj(i -> (char) i)
                .distinct()
                .collect(Collectors.toList());

            List<Character> r = words[right].chars()
                .mapToObj(i -> (char) i)
                .distinct()
                .collect(Collectors.toList());
            if (l.size() == r.size() && l.containsAll(r)) pairs++;

            right++;
            if (right == words.length) {
                left++;
                right = left+1;
            }
        }
        return pairs;
    }
}