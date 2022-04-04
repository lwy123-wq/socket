package aa;

import java.util.HashSet;
import java.util.Set;

public class Solution6 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> list=new HashSet<ListNode>();
        ListNode temp=headA;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(list.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;

    }
}