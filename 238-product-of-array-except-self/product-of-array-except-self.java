class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] answer = new int[nums.length];
        // int value = 1;
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int x : nums) {
        //     list.add(x);
        //     list2.add(x);

        // }
        // for (int i = 0; i < list.size(); i++) {
        //     list2.remove(i);
        //     for (int ii = 0; ii < list2.size(); ii++) {
        //         value *= list2.get(ii); 
        //     }
        //     list2.clear();
        //     list2.addAll(list);
        //     answer[i] = value;
        //     value = 1;
        // }
        // return answer;

        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n -2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = suffix[i] * prefix[i];
        }
        return answer;
    }
}