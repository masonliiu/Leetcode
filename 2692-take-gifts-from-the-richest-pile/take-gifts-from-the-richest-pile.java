class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int j = 0; j < k; j++) {
            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int) Math.floor(Math.sqrt(gifts[gifts.length-1]));
        }
        long sum = 0;
        for (int x : gifts) sum += (long) x;
        return sum;
    }
}