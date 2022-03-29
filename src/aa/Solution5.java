package aa;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }

    public ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}
public class Solution5 {
    public static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 pre = new ListNode1(0);
        ListNode1 cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode1(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode1(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode1 n1=new ListNode1(3);
        ListNode1 n2=new ListNode1(4,n1);
        ListNode1 n3=new ListNode1(2,n2);
        ListNode1 b1=new ListNode1(4);
        ListNode1 b2=new ListNode1(6,b1);
        ListNode1 b3=new ListNode1(5,b2);
        System.out.println(Solution5.addTwoNumbers(n3, b3));

    }
}

