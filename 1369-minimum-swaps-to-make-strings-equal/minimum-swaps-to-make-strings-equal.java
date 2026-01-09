class Solution {
    public int minimumSwap(String s1, String s2) {
        int xy = 0;
        int yx = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') xy++;
                else yx++;
            }
        }
        if ((xy + yx) % 2 != 0) return -1;
        return xy/2 + yx/2 + (xy % 2 != 0 ? 2 : 0);
    }
}