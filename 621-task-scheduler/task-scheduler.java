class Solution {
    public int leastInterval(char[] tasks, int n) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char x : tasks) {
        //     if (!map.containsKey(x))
        //         map.put(x, 1);
        //     else 
        //         map.put(x, map.get(x) + 1);
        // }
        // int total = 0;
        // String str = "";
        // while (!map.isEmpty()) {
        //     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //         if (map.get(entry.getKey()) <= 0) {
        //             map.remove(entry.getKey());
        //             break;
        //         }
        //         if (str.length() < n && str.contains(entry.getKey().toString())) {
        //             total++;
        //             str += " ";
        //             System.out.println(map + " " + str + " first");
        //             break;
        //         }
        //         if (str.length() >= n) {
        //             if (str.substring(str.length()-n).contains(entry.getKey().toString())) {
        //                 if (map.get(entry.getKey()) <= 0) {
        //                     total++;
        //                     str += " ";
        //                     System.out.println(map + " " + str + " inside");
        //                     map.remove(entry.getKey());
        //                     break;
        //                 }
        //                 total++;
        //                 str += " ";
        //                 System.out.println(map + " " + str);
        //                 break;
        //             }
        //         }
        //         map.put(entry.getKey(), map.get(entry.getKey()) -1);
        //         total++;
        //         str += entry.getKey();
        //         System.out.println(map + " " + str);
        //     }
        // }
        // return total;

        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char x : tasks) {
        //     if (!map.containsKey(x))
        //         map.put(x, 1);
        //     else
        //         map.put(x, map.get(x) + 1);
        // }

        // int total = 0;
        // String str = "";

        // while (!map.isEmpty()) {
        //     Character best = null;
        //     int bestCount = -1;

        //     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //         if (entry.getValue() <= 0) continue;

        //         char task = entry.getKey();
        //         boolean blocked;

        //         if (str.length() < n) {
        //             blocked = str.indexOf(task) != -1;
        //         } else {
        //             blocked = str.substring(str.length() - n).indexOf(task) != -1;
        //         }

        //         if (!blocked && entry.getValue() > bestCount) {
        //             bestCount = entry.getValue();
        //             best = task;
        //         }
        //     }

        //     if (best == null) {
        //         total++;
        //         str += " ";
        //     } else {
        //         map.put(best, map.get(best) - 1);
        //         total++;
        //         str += best;
        //     }

        //     Iterator<Map.Entry<Character, Integer>> clean = map.entrySet().iterator();
        //     while (clean.hasNext()) {
        //         if (clean.next().getValue() <= 0) clean.remove();
        //     }
        // }

        // return total;

        int[] freq = new int[26];
        for (char t : tasks) freq[t - 'A']++;

        int maxCount = 0;
        for (int f : freq) maxCount = Math.max(maxCount, f);

        int numMax = 0;
        for (int f : freq) if (f == maxCount) numMax++;

        int frames = (maxCount - 1) * (n + 1) + numMax;
        return Math.max(tasks.length, frames);
    }
}