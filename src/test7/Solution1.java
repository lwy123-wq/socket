package test7;

/**
 * Definition for singly-linked list.*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        head.next=deleteDuplicates(head.next);
        if(head.val==head.next.val){
            head=head.next;
        }
        return head;
    }

}