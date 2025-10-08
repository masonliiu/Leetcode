class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder(s);
        StringBuilder str;
        int count = 0;
        for (int i = 0; i < s.length(); i += 2*k) {
            if (s.length()-1 < i+k) {
                str = new StringBuilder(s.substring(i, s.length()));
                str.reverse();
                res.replace(i, i+k, str.toString());
                break;
            }
            str = new StringBuilder(s.substring(i, i+k));
            str.reverse();

            res.replace(i, i+k, str.toString());
        }
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != res.charAt(i)) {
                break;
            }
            count++;
        }
        if (count < 2*k && count >= k) {
            str = new StringBuilder(s.substring(0, k));
            str.reverse();
            res.replace(0, k, str.toString());
        }
        return res.toString();
    }
}