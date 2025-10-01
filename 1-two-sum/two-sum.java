class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] str = new int[2];
        for (int x : nums) {
            list2.add(x);
            System.out.println(x);
        }
        boolean check = true;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            for (int ii = 0; ii < list2.size(); ii++) {
                if (list2.get(ii) + list2.get(i) == target && i != ii) {
                    str[0] = list2.indexOf(list2.get(i));
                    str[1] = list2.lastIndexOf(list2.get(ii));
                    System.out.print(str[0] + " " + str[1]);
                    return str;
                }
            }
        }
        return str;
    }
}