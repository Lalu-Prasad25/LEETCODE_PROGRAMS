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
    public ListNode deleteDuplicates(ListNode head) {
       ArrayList<Integer> a = new ArrayList();
        while(head!=null){
            if(!a.contains(head.val)){
                a.add(head.val);
            }
            head =head.next;
        }
        head =null;
        ListNode root =null;
        for(Integer i:a){
        ListNode l =new ListNode(i);
            if(head == null){
                head = l;
                root =l;
            }else{
            root.next = l;
            root = root.next;
        }}
        return head ;
        
    }
}