class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];
        for (char t : tasks) freq[t - 'A']++;

        int maxCount = 0;
        for (int f : freq) maxCount = Math.max(maxCount, f);

        int numMax = 0;
        for (int f : freq) if (f == maxCount) numMax++;
        return Math.max(tasks.length, (maxCount - 1) * (n + 1) + numMax);
    }
}