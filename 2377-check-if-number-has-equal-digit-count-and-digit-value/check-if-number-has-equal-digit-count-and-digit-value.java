class Solution {
    public boolean digitCount(String num) {
        int storage = 0;
        
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (num.substring(j, j + 1).equals(String.valueOf(i))) {
                    storage++;
                }
            }
            if (storage != Integer.valueOf(num.substring(i, i + 1))) {
                return false;
            }
            storage = 0;
        }
        return true;
    }
}