/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head){
            return nullptr;
        }
        ListNode* curr= head;
        vector<int> arr;
        while(curr){
            arr.push_back(curr->val);
            curr= curr->next;
        }
        reverse(arr.begin(), arr.end());
        ListNode* newNode= new ListNode(arr[0]);
        ListNode* track= newNode;
        for(int i= 1; i<arr.size(); i++){
            track->next= new ListNode(arr[i]);
            track= track->next;
        }
        return newNode;
    }
};
