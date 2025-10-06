/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        return postOrder(root, arr);
    }
    public List<Integer> postOrder(TreeNode root, List<Integer> arr) {
        if (root.left != null) {
            postOrder(root.left, arr);
        }
        if (root.right != null) {
            postOrder(root.right, arr);
        }
        arr.add(root.val);
        return arr;
    }
}