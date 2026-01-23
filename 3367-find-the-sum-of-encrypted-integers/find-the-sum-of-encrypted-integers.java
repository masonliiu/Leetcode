class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            int temp = Integer.MIN_VALUE;
            int[] arr = Integer.toString(nums[i]).chars().map(n -> n - '0').toArray();
            for (int x : arr) {
                if (x > temp) temp = x;
            }
            int x = 1, y=0;
            while (y < arr.length) {
                sum += temp * x;
                x*=10;
                y++;
            }
        }
        return sum;
    }
}