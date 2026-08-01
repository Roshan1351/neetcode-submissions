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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> see= new HashSet<>();
        ListNode curr= head;
        while(curr!= null){
            if(see.contains(curr)){
                return true;
            }
            see.add(curr);
            curr= curr.next;
        }
        return false;
    }
}
