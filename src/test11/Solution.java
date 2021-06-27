package test11;

import com.sun.deploy.panel.ITreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.right), maxDepth(root.left))+1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Test{
    public static void main(String[] args) {
        TreeNode treeNode1 = null;
        TreeNode treeNode2=null;
        treeNode1=new TreeNode(2,null,null);
        treeNode2=new TreeNode(3,null,null);
        TreeNode treeNode=new TreeNode(1, treeNode1,treeNode2);
        Solution solution=new Solution();
        int a=solution.maxDepth(treeNode);
        System.out.println(a);
    }
}
