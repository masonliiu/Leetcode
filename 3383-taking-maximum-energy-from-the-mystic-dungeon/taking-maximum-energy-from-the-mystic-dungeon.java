class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] arr = new int[energy.length];
        int n = energy.length, highest = -1000;
        for (int i =n-1; i>=0; i--) {
            if (i + k < n) arr[i] = energy[i] + arr[i + k];
            else arr[i] = energy[i];
            highest = Math.max(highest, arr[i]);
        }
        return highest;
    }
}