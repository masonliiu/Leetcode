class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> arr = new ArrayList<>(Arrays.stream(friends).boxed().collect(Collectors.toList()));
        int[] res = new int[friends.length];
        int counter=0;


        for (int x=0; x < order.length; x++) {
            if (arr.contains(order[x])) {
                res[counter++] = order[x];
            }
        }
        return res;
    }
}