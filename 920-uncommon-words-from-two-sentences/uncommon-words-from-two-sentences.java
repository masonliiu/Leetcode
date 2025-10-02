import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr = s1.split(" ");
        String[] arr2 = s2.split(" ");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> blacklist = new ArrayList<>();

        for (String x : arr) {
            List<String> storage = Arrays.asList(arr2);
            if (list.contains(x)) {
                list.remove(x);
                blacklist.add(x);
                continue;
            }
            if (!storage.contains(x) && !blacklist.contains(x)) {
                list.add(x);
            }
        }
        for (String x : arr2) {
            List<String> storage = Arrays.asList(arr);
            if (list.contains(x)) {
                list.remove(x);
                blacklist.add(x);
                continue;
            }
            if (!storage.contains(x) && !blacklist.contains(x)) {
                list.add(x);
            }
        }
        String[] sar = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            sar[i] = list.get(i);
        }
        return sar;
    }
}