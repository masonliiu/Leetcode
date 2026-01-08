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
    public int sumNumbers(TreeNode root) {
        String str = "";
        return depth(root, str);
    }
    public int depth(TreeNode root, String str) {
        if (root == null)
            return 0;
        str += root.val;
        if (root.left == null && root.right == null) {
            return Integer.valueOf(str);

        }
        return depth(root.left, str) + depth(root.right, str);
    }
}