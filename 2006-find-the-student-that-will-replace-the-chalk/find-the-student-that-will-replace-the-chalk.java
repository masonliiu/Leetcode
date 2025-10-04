class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int counter = 0;
        while (k >= chalk[counter]) {
            k -= chalk[counter];
            counter++;
            if (counter == chalk.length) {
                counter = 0;
            }
        }
        return counter;
    }
}