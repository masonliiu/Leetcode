class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] list = new int[nums.length];

        int[] evens = new int[nums.length/2];
        int[] odds = new int[nums.length/2];
        int even =0, odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 ) {
                evens[even++] = nums[i];
            } else {
                odds[odd++] = nums[i];
            }
        }
        even=0;
        odd=0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0) {
                list[i] = evens[even++];
            } else {
                list[i] = odds[odd++];
            }
        }
        return list;

    }
}