package aa;

import java.util.ArrayList;
import java.util.List;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode1 root) {
        List<Integer> list=new ArrayList<Integer>();
        fun(list,root);
        return list;


    }
    public void fun(List<Integer> list,TreeNode1 root){
        if(root==null){
            return;
        }
        fun(list,root.left);
        list.add(root.val);
        fun(list,root.right);
    }
}
