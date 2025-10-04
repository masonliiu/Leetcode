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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        int storage = Integer.MAX_VALUE;

        for (int i = list.size() - 1; i > 0; i--) {
            if (Math.abs(list.get(i) - list.get(i-1)) < storage) {
                storage = Math.abs(list.get(i) - list.get(i-1));
            }
        }
        return storage;
    }

    public void dfs(TreeNode current, ArrayList<Integer> list) {
        if (current == null) {
            return;
        }
        dfs(current.left, list);
        list.add(current.val);
        dfs(current.right, list);

    }
}