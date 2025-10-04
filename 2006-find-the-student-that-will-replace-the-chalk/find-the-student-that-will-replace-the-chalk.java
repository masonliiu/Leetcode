class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long d = 0;
        for (int i = 0; i < chalk.length; i++) {
            d += chalk[i];
        }
        k %= d;
        int counter = 0;
        while (k >= chalk[counter]) {
            k -= chalk[counter];
            counter++;
        }
        return counter;
    }
}