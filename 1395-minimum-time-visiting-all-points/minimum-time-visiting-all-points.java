class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
      int count = 0;
      int x = 0;
      int y = 1;
      while (y < points.length) {
        if (Math.abs(points[x][0] - points[y][0]) >= 1 && Math.abs(points[x][1] - points[y][1]) >= 1) {
          count++;
          points[x][0] = ((points[x][0] - points[y][0]) >= 1) ? --points[x][0] : ++points[x][0];
          points[x][1] = ((points[x][1] - points[y][1]) >= 1) ? --points[x][1] : ++points[x][1];
        } else if (Math.abs(points[x][0] - points[y][0]) >= 1) {
          count++;
          points[x][0] = ((points[x][0] - points[y][0]) >= 1) ? --points[x][0] : ++points[x][0];
        } else if (Math.abs(points[x][1] - points[y][1]) >= 1) {
          count++;
          points[x][1] = ((points[x][1] - points[y][1]) >= 1) ? --points[x][1] : ++points[x][1];
        } else {
          x++;
          y++;
        }
      }

      return count;
    }
}
// @leet end