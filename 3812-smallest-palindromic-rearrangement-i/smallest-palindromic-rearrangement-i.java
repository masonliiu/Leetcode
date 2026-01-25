class Solution {
    public String smallestPalindrome(String s) {
        int i = s.length(), x = s.length() /2;

        if (i == 1 || i == 2) return s;
        char[] arr = s.substring(0, s.length()/2).toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);

        StringBuilder reverse = new StringBuilder(str).reverse();
        if (s.length() % 2 == 1) str += s.charAt(s.length()/2);
        return str + reverse.toString();
    }
}