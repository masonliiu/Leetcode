class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        int[] arr = new int[k*2];
        outerLoop:
        for (int x = 0; x  + 2 * k <= nums.size(); x++) {
            for (int i = 0, z = x; i < k; i++, z++) {
            arr[i] = nums.get(z);
            arr[i + k] = nums.get(z + k);
            }

            for ( int y : arr) {
            }

            for (int var = 0; var < k - 1; var++) {
                if (arr[var] >= arr[var+1]) {
                continue outerLoop;
                }
            }
            for (int var = k; var < k * 2 - 1; var++) {
                if (arr[var] >= arr[var+1]) {
                    continue outerLoop;
                }
            }
            return true;
        }
        return false;
    }

        // for (int i = 0; i < nums.size() - k; i++) {
        //     int left = i;
        //     int right = i + k -1;
        //     for (int x = 0; x < k-1; x++) {
        //         System.out.println("outer " + nums.get(left) + " compared to " + nums.get(left+1) + " . " + nums.get(right) + " compared to " + nums.get(right+1));
        //         if (nums.get(left) < nums.get(++left)) {
        //             if (nums.get(right) < nums.get(++right)) {
        //                 System.out.println(nums.get(left-1) + " compared to " + nums.get(left) + " . " + nums.get(right-1) + " compared to " + nums.get(right));
        //                 System.out.println(right + " is the size");
        //                 if (right == nums.size() -1) return true;
        //                 continue;
        //             }
        //         }
        //         if (right == nums.size() -1) return true;
        //         break;
        //     }
        // }
        // return false;
}