class Solution {
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n+1];
        return helper(n, visited, 1);
    }

    private int helper(int n, boolean[] visited, int pos) {
        if (pos > n) return 1;
        int count =0;
        for (int i =1; i <= n; i++) {
            if(!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;
                count += helper(n, visited, pos + 1);
                visited[i] = false;
            }
        }
        return count;
    }
}