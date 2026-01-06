import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String w : words) {
            for (String part : w.split(Pattern.quote(String.valueOf(separator)))) {
                if (!part.isEmpty()) res.add(part);
            }
        }
        return res;
    }
}
