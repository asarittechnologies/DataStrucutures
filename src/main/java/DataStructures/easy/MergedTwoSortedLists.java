package DataStructures.easy;

public class MergedTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new  ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);

        ListNode l2 = new  ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);

        MergedTwoSortedLists m = new MergedTwoSortedLists();
        ListNode res = m.mergeSortedLists(l1,l2);
        while(res != null){
            System.out.println(res.val + " ");
            res = res.next;
        }



    }
    public ListNode mergeSortedLists(ListNode l1,ListNode l2){
        ListNode temp = null,head = null;
        if(l1== null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp = head = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                temp = head = new ListNode(l2.val);
                l2 = l2.next;
            }
        }
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            temp = temp.next;
        }
        while( l1 != null){
            temp.next = new ListNode(l1.val);
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null){
            temp.next = new ListNode(l2.val);
            l2 = l2.next;
            temp = temp.next;
        }

        return head;

    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
