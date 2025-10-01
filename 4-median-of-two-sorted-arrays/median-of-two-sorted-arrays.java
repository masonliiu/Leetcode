class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> fin = new ArrayList<>();

        for ( int x : nums1) {
            fin.add(x);
        }
        for ( int y : nums2) {
            fin.add(y);
        }
        fin.sort(null);
        if (fin.size() % 2 == 0) {
            return ((fin.get(fin.size() / 2 - 1) + (double) fin.get(fin.size() / 2)) / 2);
            
        } else {
            return fin.get(Math.round(fin.size() / 2));
        }
    }
}