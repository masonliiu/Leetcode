class Solution {
    public String reversePrefix(String word, char ch) {
        // StringBuilder str = new StringBuilder("");

        // for (int i = 0; i < word.length(); i++) {
        //     if (word.charAt(i) ==ch) {
        //         str.append(word.charAt(i));
        //         str.reverse();
        //         return str + word.substring(i+1);
        //     }
        //     str.append(word.charAt(i));
        // }

        // return word;

        int i = word.indexOf(ch);
        if (i != -1) return new StringBuilder(word.substring(0, i + 1)).reverse() + word.substring(i + 1);
        return word;
    }
}