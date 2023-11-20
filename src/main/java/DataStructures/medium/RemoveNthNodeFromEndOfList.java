package DataStructures.medium;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList r =new RemoveNthNodeFromEndOfList();
        ListNode newNode = new ListNode(0);
        ListNode one = new ListNode(1);
        one.next =  new ListNode(2);
        one.next.next = new ListNode(3);
        one.next.next.next = new ListNode(4);
        one.next.next.next.next = new ListNode(5);
        one.next.next.next.next.next = new ListNode(6);


    }
    public ListNode removeNthNode(ListNode head,int n){
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }



}

class ListNode{
    int value;
    ListNode next;
    ListNode(){}
    ListNode(int value){
        this.value = value;
    }
    ListNode(int value,ListNode node){
        this.value = value;
        this.next = node;
    }
}