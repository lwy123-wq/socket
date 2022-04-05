package aa;

import java.util.HashSet;

public class Solution4 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<ListNode>();
        while(head!=null){
            if(!set.add(head)){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
