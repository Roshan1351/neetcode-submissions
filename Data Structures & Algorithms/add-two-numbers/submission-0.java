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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        ListNode curr= dummy;

        int carry= 0;
        while(l1!= null || l2!= null || carry!= 0){
            int value1;
            if(l1!= null){
                value1= l1.val;
            }else{
                value1= 0;
            }

            int value2;
            if(l2!= null){
                value2= l2.val;
            }else{
                value2= 0;
            }

            int value= value1+value2+carry;
            carry= value/10;
            value= value%10;
            curr.next= new ListNode(value);

            curr= curr.next;
            l1= (l1!= null)?l1.next:null;
            l2= (l2!= null)?l2.next:null;

        }
        return dummy.next;
    }
}
