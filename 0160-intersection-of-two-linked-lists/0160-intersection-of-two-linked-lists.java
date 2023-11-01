/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // brute force 
        // approach is just find the difference between len of these two LL
        // after that start travesing and check

        

        // ListNode temp1 = headA;
        // ListNode temp2 = headB;
        // int count1 = 0, count2 = 0;

        // while(temp1 != null){
        //     count1 ++ ;
        //     temp1 = temp1.next;
        // }
        // while(temp2 != null){
        //     count2++;
        //     temp2 = temp2.next;
        // }
        // if(count1 > count2){
        //     temp1 = headA;
        //     temp2 = headB;
        //     int lenDiff = count1-count2;
        //     while(lenDiff != 0){
        //         temp1 = temp1.next;
        //         lenDiff--;
        //     }

        //     while(temp1 != null){
        //         if(temp1 == temp2){
        //             return temp1;
        //         }
        //         temp1 = temp1.next;
        //         temp2 = temp2.next;
        //     }
        // }
        // else if(count2 > count1){
        //     temp1 = headA;
        //     temp2 = headB;
        //     int lenDiff = count2-count1;
        //     while(lenDiff != 0){
        //         temp2 = temp2.next;
        //         lenDiff--;
        //     }

        //     while(temp1 != null){
        //         if(temp1 == temp2){
        //             return temp1;
        //         }
        //         temp1 = temp1.next;
        //         temp2 = temp2.next;
        //     }
            

        // }
        // else{

        //     while(temp1 != null){
        //         if(temp1 == temp2){
        //             return temp1;
        //         }
        //         temp1 = temp1.next;
        //         temp2 = temp2.next;
        //     }

        // }

        // return null;


        // Approach without finding the difference between len

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){
            temp1 = temp1==null? headB : temp1.next;
            temp2 = temp2==null? headA : temp2.next;
        }

        return temp1;



    }
}