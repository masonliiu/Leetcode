class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int c=0;
        for (int x : derived) c^=x;
        return c==0;
    }
}