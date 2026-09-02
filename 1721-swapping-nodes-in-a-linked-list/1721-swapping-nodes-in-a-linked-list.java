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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> a = new ArrayList();
        while(head !=null){
            a.add(head.val);
            head = head.next;
        }
        ListNode root= null;
        head = null;
        int temp = a.get(k-1);
        a.set(k-1 ,a.get(a.size()-k));
        a.set(a.size()-k, temp);

        for(Integer i : a){
            ListNode tem = new ListNode(i);
            if(root == null){
                head = tem ;
                root = tem;
            }else{
                root.next= tem;
                root = root.next;
            }
        }
        return head;
    }
}