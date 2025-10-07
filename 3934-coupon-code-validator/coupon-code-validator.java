class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, List<String>> table = new HashMap<>(); 

        outerLoop:
        for (int i = 0; i < code.length; i++) {
            if (code[i].isEmpty()) continue;

            for (char x : code[i].toCharArray()) {
                if (!Character.isLetterOrDigit(x) && x != '_') {
                    continue outerLoop;
                }
            }

            if (!(businessLine[i].equals("electronics") || businessLine[i].equals("grocery") || businessLine[i].equals("pharmacy") || businessLine[i].equals("restaurant"))) {
                continue;
            }

            if (!isActive[i]) {
                continue;
            }

            if (!table.containsKey(businessLine[i])) {
                table.put(businessLine[i], new ArrayList<String>());
            }
            table.get(businessLine[i]).add(code[i]);
        }
        
        for (String s : table.keySet()) {
            Collections.sort(table.get(s));
        }

        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        List<String> res = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            if (table.containsKey(order[i])) {
                res.addAll(table.get(order[i]));
            }
        }
        return res;
    }
}