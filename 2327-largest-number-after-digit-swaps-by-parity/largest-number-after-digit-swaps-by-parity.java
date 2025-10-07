class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
         int storage = 0;

        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            nums.add(Character.getNumericValue(str.charAt(i)));
        }
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                for (int x = i+1; x < nums.size(); x++) {
                    if (nums.get(x) % 2 == 0 && nums.get(x) > nums.get(i)) {
                        storage = nums.get(x);
                        nums.set(x, nums.get(i));
                        nums.set(i, storage);
                        continue;
                    }
                }
            }
            if (nums.get(i) % 2 != 0) {
                for (int x = i+1; x < nums.size(); x++) {
                    if (nums.get(x) % 2 != 0 && nums.get(x) > nums.get(i)) {
                        storage = nums.get(x);
                        nums.set(x, nums.get(i));
                        nums.set(i, storage);
                        continue;
                    }
                }
            }
        }
        String s = "";
        for (int x : nums) {
            s += x;
        }
        return Integer.valueOf(s);
    }
}