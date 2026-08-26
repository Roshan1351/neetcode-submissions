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

    public ListNode merge(ListNode h1, ListNode h2){
        if(h1==null){
            return h2;
        }else if(h2==null){
            return h1;
        }


        if(h1.val<=h2.val){
            h1.next= merge(h1.next, h2);
            return h1;
        }else{
            h2.next= merge(h1, h2.next);
            return h2;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans= merge(list1, list2);
        return ans;
    }
}