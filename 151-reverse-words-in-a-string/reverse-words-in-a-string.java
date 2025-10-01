class Solution {
    public String reverseWords(String s) {
        String[] arr = new String[s.length()];
        arr = s.split(" ");
        Stack<String> list = new Stack<>();
        String rr = "";

        for (String x : arr) {
            if (x.isEmpty()) {
                continue;
            }
            list.push(x);
        }
        while (!list.isEmpty()) {
            rr += list.pop();
            if (list.isEmpty()) {
                break;
            }
                rr += " ";
        }
        return rr;

    }
}