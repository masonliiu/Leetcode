class Solution {
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        dfs(root, res);
        return res;
    }
    public void dfs(Node root, List<Integer> res) {
        for (Node child : root.children) dfs(child, res);
        res.add(root.val);
    }
}