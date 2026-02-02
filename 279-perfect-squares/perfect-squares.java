class Solution {
    public int numSquares(int n) {
        while (n % 4 == 0) n /= 4;
        if (n % 8 == 7) return 4;
        for (int i = 0; i * i <= n; i++) if ((int) Math.sqrt(n-i*i) * (int) Math.sqrt(n - i * i) == n - i * i) return i > 0 ? 2 : 1;
        return 3;
    }
}