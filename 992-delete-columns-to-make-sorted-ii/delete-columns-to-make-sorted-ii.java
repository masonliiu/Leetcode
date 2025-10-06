class Solution {
    public int minDeletionSize(String[] strs) {
        String[] str = new String[strs.length];
        int counter = 0;

        for (int x = 0; x < strs[0].length(); x++) {

            String[] tester = Arrays.copyOf(str, strs.length);

            for (int i = 0; i < strs.length; i++) {
                tester[i] += strs[i].charAt(x);
            }  

            if(isSorted(tester)) {
                str = tester;
            } else {
                counter++;
            }
        }
        return counter;
    }
    public boolean isSorted(String[] test) {
        for (int i = 0; i < test.length -1; i++) {
            if (test[i].compareTo(test[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }
}