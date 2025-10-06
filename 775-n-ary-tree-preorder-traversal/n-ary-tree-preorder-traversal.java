class Solution {
    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        dfs(root, arr);
        return arr;
    }
    public void dfs(Node root, List<Integer> arr) {
        arr.add(root.val);
        for (Node x : root.children) {
            dfs(x, arr);
        }
    }
}