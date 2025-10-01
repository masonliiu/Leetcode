class Solution {
    public boolean isSubsequence(String s, String t) {
        // int max = 0;
        // int max2 = 0;
        // String ss = s;
        // boolean check = true;
        // ArrayList<String> list = new ArrayList<>();
        // if (t.isEmpty() && s.isEmpty()) {
        //     return true;
        // }
        // if (t.isEmpty()) {
        //     return false;
        // }
        // if (s.isEmpty()) {
        //     return true;
        // }
        // for (int i = 0; i < ss.length() + 1; i++) {
        //     System.out.println(ss.substring(0, 1));
        //     System.out.println(ss + " here");
        //     if (ss.length() == 1) {
        //         if (t.contains(ss.substring(0, 1))) {
        //             System.out.println(ss);
        //             System.out.println(ss.substring(0, 1) + "fffff");
        //             list.add(ss.substring(0, 1));
        //             max++;
        //             break;
        //         }
        //     }
        //     if (t.contains(ss.substring(0, 1))) {
        //         max++;
        //         list.add(ss.substring(0, 1));
        //         ss = ss.substring(1);
        //         continue;
        //     }
        //     ss = ss.substring(1);
        //     list.add(ss.substring(0, 1));
        //     System.out.println(max + " ff " + list);
        // }
        // System.out.println(max);
        // if (max == s.length()) {
        //     for (int i = 0; i < s.length() - 1; i ++) {
        //         System.out.println(i + " i");
        //         if (t.indexOf(list.get(i)) > t.indexOf(list.get(i + 1))) {
                    
        //             return false;
        //         }
        //         list.remove(s.substring(i, i + 1));`
        //         max2 = t.indexOf(s.substring(i + 1, i + 2));
        //         list.add(0, null);
        //         System.out.println(list);
        //     }
        // } else {
        //     return false;
        // }
        // return true;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}