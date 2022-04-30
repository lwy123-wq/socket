package aa;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.Stack;

public class Solution9 {
    public int ReverseList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        while(head !=null){
            stack.push(head);
            head=head.next;
        }
        if(stack.isEmpty()){
            return 0;
        }
        ListNode list=stack.pop();
        System.out.println(list.val);
        ListNode node=list;
        System.out.println(node.val+"aaaaaaaaaaaaaaaaaaaa");
        while(!stack.isEmpty()){
            ListNode tempNode=stack.pop();
            list.next=tempNode;
            list=list.next;
            System.out.println(list.val);
        }
        list.next=null;
        return node.val;
    }

    public static void main(String[] args) {
        ListNode list3=new ListNode(3);
        ListNode list2=new ListNode(2,list3);
        ListNode list1=new ListNode(1,list2);
        Solution9 solution9=new Solution9();
        System.out.println(solution9.ReverseList(list1));


    }
}
