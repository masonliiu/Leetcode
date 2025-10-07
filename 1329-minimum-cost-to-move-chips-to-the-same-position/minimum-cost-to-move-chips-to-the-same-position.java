class Solution {
    public int minCostToMoveChips(int[] position) {
        int odds = 0;
        int evens = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) evens++;
            else odds++;
        }
        return Math.min(odds, evens);
    }
}