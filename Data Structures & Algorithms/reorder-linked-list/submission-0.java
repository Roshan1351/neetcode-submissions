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
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr= new ArrayList<>();
        ListNode curr= head;
        while(curr!= null){
            arr.add(curr.val);
            curr= curr.next;
        }
        int i= 0;
        int j= arr.size()-1;
        ArrayList<Integer> arr2= new ArrayList<>();
        int k= 0;
        while(i<=j){
            arr2.add(arr.get(i));
            arr2.add(arr.get(j));
            i++;
            j--;
        }
        ListNode ans= head;
        while(ans!= null){
            ans.val= arr2.get(k);
            k++;
            ans= ans.next;
        }

    }
}
