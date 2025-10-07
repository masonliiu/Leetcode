class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
         int storage = 0;

        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            nums.add(Character.getNumericValue(str.charAt(i)));
        }
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        int evens = 0, odds = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                sb.append(even.get(evens++));
            } else {
                sb.append(odd.get(odds++));
            }
        }
        return Integer.parseInt(sb.toString());


        // for (int i = 0; i < nums.size(); i++) {
        //     if (nums.get(i) % 2 == 0) {
        //         for (int x = i+1; x < nums.size(); x++) {
        //             if (nums.get(x) % 2 == 0 && nums.get(x) > nums.get(i)) {
        //                 storage = nums.get(x);
        //                 nums.set(x, nums.get(i));
        //                 nums.set(i, storage);
        //                 continue;
        //             }
        //         }
        //     }
        //     if (nums.get(i) % 2 != 0) {
        //         for (int x = i+1; x < nums.size(); x++) {
        //             if (nums.get(x) % 2 != 0 && nums.get(x) > nums.get(i)) {
        //                 storage = nums.get(x);
        //                 nums.set(x, nums.get(i));
        //                 nums.set(i, storage);
        //                 continue;
        //             }
        //         }
        //     }
        // }
    }
}