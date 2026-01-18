class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ArrayList<Integer> list2 = new ArrayList<>();
        // int[] str = new int[2];
        // for (int x : nums) {
        //     list2.add(x);
        // }
        // boolean check = true;
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < list2.size(); i++) {
        //     for (int ii = 0; ii < list2.size(); ii++) {
        //         if (list2.get(ii) + list2.get(i) == target && i != ii) {
        //             str[0] = list2.indexOf(list2.get(i));
        //             str[1] = list2.lastIndexOf(list2.get(ii));
        //             return str;
        //         }
        //     }
        // }
        // return str;
        int left = 0;
        int right = 1;
        int[] sum = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                sum[0] = left;
                sum[1] = right;
                return sum;
            }
            if (right == nums.length-1) {
                left++;
                right = left + 1;
                continue;
            }
            right++;
        }
        return sum;
    }
}