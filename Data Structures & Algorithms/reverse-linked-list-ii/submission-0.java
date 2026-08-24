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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }

        List<Integer> arr= new ArrayList<>();
        ListNode curr= head;
        while(curr!= null){
            arr.add(curr.val);
            curr= curr.next;
        }
        while(left<right){
            int temp= arr.get(left-1);
            arr.set(left-1, arr.get(right-1));
            arr.set(right-1, temp);
            left++;
            right--;
        }
        ListNode current= head;
        int i= 0;
        while(current!= null){
            current.val= arr.get(i);
            i++;
            current= current.next;
        }
        return head;
    }
}