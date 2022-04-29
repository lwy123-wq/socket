package aa;

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

class Solution8{

    int aa;

    public int diameterOfBinaryTree(TreeNode1 root) {
        aa=1;
        depth(root);
        return aa-1;
    }
    public int depth(TreeNode1 root){
        if(root==null){
            return 0;
        }
        int left1=depth(root.left);
        int right1=depth(root.right);
        aa=Math.max(aa,left1+right1+1);
        return Math.max(left1,right1)+1;
    }
}