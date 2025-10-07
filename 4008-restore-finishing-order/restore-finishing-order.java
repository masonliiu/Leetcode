class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> arr = new ArrayList<>();
        for (int x : friends) {
            arr.add(x);
        }
        int counter=0;


        for (int x=0; x < order.length; x++) {
            if (arr.contains(order[x])) {
                friends[counter++] = order[x];
            }
        }
        return friends;
    }
}