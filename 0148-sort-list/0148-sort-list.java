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
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
       ListNode slow = head;
       ListNode fast = head.next;

       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }

       ListNode mid = slow.next;
       slow.next = null;

       ListNode left = sortList(head);
       ListNode right = sortList(mid);

       return merge(left,right);
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1=l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        else curr.next = l2;
    
    return dummy.next;
    }
}




// public ListNode sortList(ListNode head) {
//         if(head == null){
//             return head;
//         }

//         for(ListNode i=head; i != null;i=i.next){
//             for(ListNode j=i.next;j != null;j=j.next){
//                 if(i.val > j.val){
//                     long temp = i.val;
//                     i.val = j.val;
//                     j.val = temp;
//                 }
//             }
//         }
//         return head;
//     }