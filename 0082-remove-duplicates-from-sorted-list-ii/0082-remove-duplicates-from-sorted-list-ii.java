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
            HashMap<Integer,Integer> h = new HashMap();
               ArrayList<Integer> a = new ArrayList();
            ListNode li = head;
        while (head != null) {
        if (h.containsKey(head.val)) {
             int count = h.get(head.val);
                count++;
                h.put(head.val, count);
            } else {
                h.put(head.val, 1);
     }
             head = head.next;
}
        head =li;
         while (head != null) {
            if (h.get(head.val) == 1) {
                a.add(head.val);
            }
            head = head.next;
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