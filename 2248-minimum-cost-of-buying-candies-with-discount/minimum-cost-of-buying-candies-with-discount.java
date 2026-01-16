class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        for (int i = 0, j = cost.length-1; i < j; i++, j--) {
            int storage = cost[i];
            cost[i] = cost[j];
            cost[j] = storage;
        }
        int sum = 0;
        if (cost.length == 1) return cost[0];
        if (cost.length == 2) return cost[0] + cost[1];
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 != 2) sum += cost[i];
        }
        return sum;
    }
}