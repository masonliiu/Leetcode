class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        String str = "";
        for (String x : words) {
            str += x + separator;
        }
        String[] parts = str.split("\\"+String.valueOf(separator));
        List<String> res = new ArrayList<>();
        for (String p : parts) {
            if (!p.isEmpty()) res.add(p);
        }
        return res;
    }
}