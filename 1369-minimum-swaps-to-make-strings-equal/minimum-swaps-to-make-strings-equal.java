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
        int left =0;
        if ( (xy) % 2 != 0) left+=2;
        return xy/2 + yx/2 + left;
        //yyyxxx
        //xxyxxy  6

        //xxyyyy  2
        //xxxyyx

        //if 1 position swap needed, 2 swaps total
        // if 2 position swap needed, 4 max swaps total
        // if 3 position swaps needed, 6 max total swaps


    }
}