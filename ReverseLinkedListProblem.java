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

class ReverseLinkedListProblem {
    public ListNode reverseList(ListNode head) {
        ListNode last=null,f=null;
        while(head!=null){
            f=new ListNode(head.val);
            f.next=last;
            last=f;
            head=head.next;
        }
        return f;
    }
}
