class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int x : gifts) pq.offer(x);
        while (k-->0) pq.offer((int) Math.floor(Math.sqrt(pq.poll())));
        while (!pq.isEmpty()) sum += pq.poll();
        return sum;
    }
}