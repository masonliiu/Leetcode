import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums[i].length; x++) {
                list.add(nums[i][x]);
            }
        }
        Collections.sort(list);
        if (nums.length == 1) {
            return list;
        }

        for (int i = 0; i < list.size() - 1; i++) { 
            if (finalList.contains(list.get(i))) { 
                continue;
            }
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (count == nums.length - 1) {
                    finalList.add(list.get(i));
                    count = 0;
                }
            } else { 
                count = 0;
            }
        }
        return finalList;
    }
}