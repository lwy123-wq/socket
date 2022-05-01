package aa;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution10{
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode node=new ListNode(-1);
        node.next=head;
        ListNode pre=node;
        for(int i=0;i<m-1;i++){
            pre=pre.next;
        }
        ListNode list=pre.next;
        ListNode list_next;
        for(int j=0;j<n-m;j++){
            list_next=list.next;
            list.next=list_next.next;

        }
        //TODO
        return null;
    }
}
