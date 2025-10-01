class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0, j = 1; i < words.length - 1; j++) {
            if (isPrefixAndSuffix(words[i], words[j])) {
                count++;
            }
            if (j == words.length - 1) {
                i++;
                j = i;
            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix(String str1, String str2) {
        int index = str1.length();
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() < str2.length()) {
            if (str2.substring(0, str1.length()).equals(str1)) {
                if (str2.substring(str2.length() - str1.length()).equals(str1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
