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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        return preOrder(root, arr);
    }
    public List<Integer> preOrder(TreeNode root, List<Integer> arr) {
        arr.add(root.val);
        if (root.left != null) {
            preOrder(root.left, arr);
        }
        if (root.right != null) {
            preOrder(root.right, arr);
        }
        return arr;
    }
}