class Solution {
    public String alphabetBoardPath(String target) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        String ans = "";
        for (int i =0, num = 97, x= 0; num < 123; i++, num++) {
            if (i == 5) {
                x++;
                i = 0;
            }
            ArrayList<Integer> value = new ArrayList<>();
            value.add(x);
            value.add(i);
            map.put((char) num, value);
        }
        
        int row =0, col =0;

        for (int z =0; z < target.length(); z++) {
            String res = "";
            if (map.get(target.charAt(z)).get(0) < row) {
                row = row - map.get(target.charAt(z)).get(0);
                if (map.get(target.charAt(z)).get(0) ==5) {
                    for (int i =0; i < row; i++) {
                        res += "U";
                    }
                } else {
                    for (int i =0; i < row; i++) {
                        ans += "U";
                    }
                }
            } else if (map.get(target.charAt(z)).get(0) > row) {
                row = map.get(target.charAt(z)).get(0) - row;
                if (map.get(target.charAt(z)).get(0) ==5) {
                    for (int i =0; i < row; i++) {
                        res += "D";
                    }
                } else {
                    for (int i =0; i < row; i++) {
                        ans += "D";
                    }
                }
            }
            if (map.get(target.charAt(z)).get(1) < col) {
                col = col - map.get(target.charAt(z)).get(1);
                for (int i =0; i < col; i++) {
                    ans += "L";
                }                
            } else if (map.get(target.charAt(z)).get(1) > col) {
                col = map.get(target.charAt(z)).get(1) - col;
                for (int i =0; i < col; i++) {
                    ans += "R";
                }
            }
            ans += res;
            res = "";
            
            row = map.get(target.charAt(z)).get(0);
            col = map.get(target.charAt(z)).get(1);

            if (z+1 < target.length() && target.charAt(z) == target.charAt(z+1)) {
                ans += "!!";
                z++;
                continue;
            }
            ans += "!";
        }
        return ans;
    }
}

