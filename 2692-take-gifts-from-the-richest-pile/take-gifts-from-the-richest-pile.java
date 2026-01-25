class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int x : gifts) pq.offer(x);
        for (int j = 0; j < k; j++) pq.offer((int) Math.floor(Math.sqrt(pq.poll())));
        while (!pq.isEmpty()) sum += pq.poll();
        return sum;
    }
}