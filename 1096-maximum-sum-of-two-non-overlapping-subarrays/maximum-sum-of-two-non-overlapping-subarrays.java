class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

        int[] prefix = new int[nums.length + 1];
        
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int result = 0;

        int bestFirst = 0;
        for (int i = firstLen + secondLen; i <= nums.length; i++) {
            int sumFirst = prefix[i - secondLen] - prefix[i - secondLen - firstLen];
            bestFirst = Math.max(bestFirst, sumFirst);

            int sumSecond = prefix[i] - prefix[i - secondLen];
            result = Math.max(result, bestFirst + sumSecond);
        }

        int bestSecond = 0;
        for (int i = firstLen + secondLen; i <= nums.length; i++) {
            int sumSecond = prefix[i - firstLen] - prefix[i - firstLen - secondLen];
            bestSecond = Math.max(bestSecond, sumSecond);

            int sumFirst = prefix[i] - prefix[i - firstLen];
            result = Math.max(result, bestSecond + sumFirst);
        }

        return result;
    }
}