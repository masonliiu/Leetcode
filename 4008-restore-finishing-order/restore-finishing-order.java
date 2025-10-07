class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> arr = new HashSet<>();
        for (int x : friends) 
            arr.add(x);

        int counter=0;

        for (int x : order) 
            if (arr.contains(x)) friends[counter++] = x;
        return friends;
    }
}