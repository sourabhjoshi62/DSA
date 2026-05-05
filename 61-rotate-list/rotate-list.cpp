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
    ListNode* rotateRight(ListNode* head, int k) {
         if (head == NULL || k == 0) {
            return head;
        }
        ListNode* temp = head;
        ListNode* tail = head;
        int size=1;
        while(tail->next != NULL){
            tail=tail->next;
            size++;
        }
        k = k % size;
        
        // If k becomes 0 after taking modulo, no rotation is needed
        if (k == 0) {
            return head;
        }
        temp=head;

        int rot=size-k-1;
        for(int i=0;i<rot;i++){
            temp=temp->next;
        }

        tail->next = head;
        head=temp->next;
        temp->next=NULL;

        return head;
        
    }
};