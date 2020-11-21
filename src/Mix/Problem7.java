package Mix;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Problem7 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode lMerged = new ListNode();
        while(l1 != null  || l2 != null){

                lMerged.val = l1.val;
                lMerged = lMerged.next;
                lMerged.val = l2.val;
//                l1.next;
                l2 = l2.next;
                lMerged =  lMerged.next;

        }




    return lMerged;
    }

}
