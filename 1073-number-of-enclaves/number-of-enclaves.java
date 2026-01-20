class Solution {
    int m;
    int n;
    int[][] grid;
    public int numEnclaves(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) dfs(i, 0);
            if (grid[i][n-1] == 1) dfs(i, n-1);
        }
        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1) dfs(0, i);
            if (grid[m-1][i] == 1) dfs(m-1, i);
        }

        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) count++;
            }
        }
        return count;
    }

    public void dfs(int i, int c) {
        if (i < 0 || i >= m || c < 0 || c >= n || grid[i][c] == 0) return;

        grid[i][c] = 0;
        dfs(i+1, c);
        dfs(i-1, c);
        dfs(i, c+1);
        dfs(i, c-1);
    }
}