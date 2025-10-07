class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int c = 0;
        for (int x : derived) {
            if (x==1) {
                c++;
            }
        } 
        return c % 2 == 0;
    }
}