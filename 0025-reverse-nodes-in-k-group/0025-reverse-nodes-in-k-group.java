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
    public ListNode reverse(ListNode head){
        if(head ==  null)
        return head;

        if(head.next == null)
        return head;

        ListNode curr = head;
        ListNode frwd = curr.next;
        ListNode prev = null;

        curr.next = null;

        while(frwd.next != null){
            prev = curr;
            curr = frwd;
            frwd = curr.next;
            curr.next = prev;
           // frwd = frwd.next;
        }
        frwd.next = curr;

        return frwd;
    }
    public ListNode lastNode(ListNode head){
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        return temp;

    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode traverse = head;

        for(int i = 0; i<k-1; i++){
            traverse = traverse.next;
        }

        ListNode prev = null;
       // ListNode ans = null;
        while(temp != null){
            ListNode headerPointer = temp;
            ListNode curr = headerPointer;
            int j = k;
            while(j != 1){
                if(curr == null)
                break;
                curr = curr.next;
                j--;
            }
            if(curr == null)
            break;
            temp = curr.next;
            curr.next = null;
            ListNode revHead = reverse(headerPointer);
            if(prev != null)
            prev.next = revHead;
            else{
           //     ans = revHead;
            }
            ListNode last = lastNode(revHead);
            prev = last;
            last.next = temp;
        }


        return traverse;

        
    }
}