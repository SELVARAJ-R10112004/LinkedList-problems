/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ReorderListProblem {
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode t=slow.next,second=slow.next=null;
        while(t!=null){
            ListNode temp=t.next;
            t.next=second;
            second=t;
            t=temp;
        }
        ListNode first=head;
        while(second!=null){
            ListNode temp1=first.next,temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
