package Tress;

class Node {
    Node left;
    Node right;
    int value;

    Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
    Node(int value){
        this.value = value;
    }
}
