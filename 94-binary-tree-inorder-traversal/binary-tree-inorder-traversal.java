class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        
        if (root == null) return arr;

        return inOrder(root, arr);
    }
    public List<Integer> inOrder(TreeNode curr, List<Integer> list) {
        if (curr.left != null) 
            inOrder(curr.left, list);

        list.add(curr.val);

        if (curr.right != null) 
            inOrder(curr.right, list);

        return list;
        
    }
}