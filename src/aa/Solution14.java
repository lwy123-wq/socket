package aa;

import javax.swing.tree.TreeNode;

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
class Solution14 {
    public TreeNode1 invertTree(TreeNode1 root) {
        if(root==null){
            return null;
        }
        TreeNode1 right=invertTree(root.right);
        TreeNode1 left=invertTree(root.left);
        root.left=right;
        root.right=left;
        return root;
    }
}