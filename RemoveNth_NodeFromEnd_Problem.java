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

class RemoveNth_NodeFromEnd_Problem {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy=new ListNode(0,head),l=dummy,r=head;
            while(n>0){
                n--;
                r=r.next;
            }
            while(r!=null){
                r=r.next;
                l=l.next;
            }
            l.next =l.next.next;
            return dummy.next;
    }
}
