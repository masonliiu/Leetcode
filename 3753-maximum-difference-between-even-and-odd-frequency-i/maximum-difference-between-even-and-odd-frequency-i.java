class Solution {
    public int maxDifference(String s) {
        int countOdd = Integer.MIN_VALUE;
        int countEven = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
                continue;
            }
            map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        System.out.println(map.entrySet());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                if (entry.getValue() < countEven) {
                    countEven = entry.getValue();
                }
                continue;
            }
            if (entry.getValue() > countOdd) {
                countOdd = entry.getValue();
            }
        }
        return countOdd - countEven;
    }
}