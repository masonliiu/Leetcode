class Solution {
    // private String ans;
    // Queue<char> queue;
    // int curr;
    // public String alphabetBoardPath(String target) {
    //     ans = "";
    //     char[][] board = {{'a', 'b', 'c', 'd', 'e'}, {'f', 'g', 'h', 'i', 'j'}, {'k', 'l', 'm', 'n', 'o'}, {'p', 'q', 'r', 's', 't'}, {'u', 'v', 'w', 'x', 'y'}, {'z'}};
    //     int up = 0;
    //     int down = 0;
    //     int right = 0;
    //     int left = 0;
    //     curr = 0;
    //     queue = new LinkedList<>();

    //     int row =0;
    //     int col =0;

    //     while (curr < target.length()) {
    //         if (board[row-1][col] != null) {
    //             queue.add()
    //             search(board[][], row-1, col);
    //         }
    //         if (board[row+1][col] != null) {
    //             search(board[][], row+1, col);
    //         }
    //         if (board[row][col-1] != null) {
    //             search(board[][], row, col-1);
    //         }
    //         if (board[row][col+1] != null) {
    //             search(board[][], row, col+1);
    //         }
    //         curr++;
    //     }
    // }
    // public boolean[][] search(boolean[][] board, int row, int col) {
    //     if (board[row][col] == target.charAt(curr)) {
    //         queue.offer(board[row][col]);
    //     }
    // }

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
            // if (row > 0) {
            //     for (int i =0; i < row; i++) {
            //         ans += "D";
            //     }
            // } else if (row < 0) {
            //     for (int i =0; i < row; i++) {
            //         ans += "U";
            //     }
            // }
            // if (col > 0) {
            //     for (int i =0; i < col; i++) {
            //         ans += "R";
            //     }
            // } else if (col < 0) {
            //     for (int i =0; i < col; i++) {
            //         ans += "L";
            //     }
            // }
        }
        return ans;
    }
}

