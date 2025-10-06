class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        return preOrder(root, arr);
    }
    public List<Integer> preOrder(TreeNode root, List<Integer> arr) {
        arr.add(root.val);
        if (root.left != null)
            preOrder(root.left, arr);
        if (root.right != null)
            preOrder(root.right, arr);
        return arr;
    }
}