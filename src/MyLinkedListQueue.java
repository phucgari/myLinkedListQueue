public class MyLinkedListQueue {
    Node head;
    class Node{
        private int key;
        private Node next;
        private Node(int k){
            key=k;
        }
    }
    public void enqueue(int k){
        Node newNode=new Node(k);
        newNode.next=head;
        head=newNode;
    }
    public int dequeue(){
        Node pointerAhead=head;
        Node pointerBehind=null;
        while(pointerAhead.next!=null){
            pointerBehind=pointerAhead;
            pointerAhead=pointerAhead.next;
        }
        if(pointerBehind==null)head=null;
        else pointerBehind.next=null;
        return pointerAhead.key;
    }
}
