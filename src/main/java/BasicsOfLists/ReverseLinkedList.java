package BasicsOfLists;

public class ReverseLinkedList {
    static Node head;
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        System.out.println("Given linked list");
        print();
        head = reverseLinkedList(head);
        System.out.println("Reversed linked list");
        print();
    }
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node reverseLinkedList(Node head){
         Node listSoFar = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
            current.next = listSoFar;
            listSoFar = current;
            current = next;
        }
        return listSoFar;

    }

    public static Node reverseLinkedListAtParticularPostions(Node head,int start, int end){
        int position = 1;
        Node startNode = head;
        Node listSoFar = null;
        Node current = head;
        while(position < start){
            startNode = current;
            current = current.next;
            position++;
        }

        Node tail= current;
        while(position >= start && position <= end){
            Node next = current.next;
            current.next = listSoFar;
            listSoFar = current;
            current = next;
            position++;
        }
        startNode.next = listSoFar;
        tail.next = current;
        if(start > 1){
            return head;
        }else{
            return listSoFar;
        }
    }

}
