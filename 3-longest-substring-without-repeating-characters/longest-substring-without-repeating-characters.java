// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         String ss = s;
//         ArrayList<String> list = new ArrayList<>();
//         int max = -1;
//         if (ss.length() == 1) {
//             return 1;
//         }
//         if (ss.length() == 0) {
//             return 0;
//         }

//         return helper(ss, max);
//     }
//     public int helper(String ss, int max) {
//         ArrayList<String> list1 = new ArrayList<>();
//         int max1 = max;
//         for (int i = 0; i < ss.length(); i++) {
//             if (list1.contains(ss.substring(i, i + 1))) {
//                 if (list1.size() > max1) {
//                     max1 = list1.size();
//                 }
//                 list1.clear();
//                 ss = ss.substring(ss.indexOf(ss.substring(i, i + 1)) + 1);
//                 System.out.println(ss + " here44");
//                 try {
//                     helper(ss, max1);
//                 } catch (IndexOutOfBoundsException e) {
//                 }

//             } else {
//                 list1.add(ss.substring(i, i + 1));
//                 System.out.println(ss + " " + list1 + " here2");
//                 System.out.println(max1 + " max1");
//             if (list1.size() > max1) {
//                 max1 = list1.size();
//             }
//             if (list1.size() >= ss.length()) {
//                 System.out.println("returning");
//                 return max1;
//             }
//             System.out.println(max1 + " max2");
//             }
            
//         }
//         System.out.println("hereeee");
//         return max1;

//     }

// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;
        int i = 0;

        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (!list.contains(currentChar)) {
                list.add(currentChar);
                if (list.size() > max) {
                    max = list.size();
                }
                i++;
            }
            else {
                list.remove(0);
            }
        }
        return max;
    }
}