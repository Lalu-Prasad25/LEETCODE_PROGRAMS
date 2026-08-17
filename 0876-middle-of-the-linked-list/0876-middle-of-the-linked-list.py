# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l=head

        lenn=0
        while(head!=None):
            lenn=lenn+1
            head=head.next

        lenn=lenn//2
        lenn=lenn+1

        head=l
        count=0

        while(head!=None):
            count=count+1
            if count is lenn:
                return head
            head=head.next

        