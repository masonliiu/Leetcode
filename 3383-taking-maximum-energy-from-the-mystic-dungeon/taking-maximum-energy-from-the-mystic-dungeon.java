class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, highest = -1000;
        for (int i =n-1; i>=0; i--) {
            if (i + k < n) energy[i] += energy[i + k];
            highest = Math.max(highest, energy[i]);
        }
        return highest;
    }
}