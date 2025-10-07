class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int c=0;
        for (int x : derived)
            if (x==1) c^=x;
        return c==0;
    }
}