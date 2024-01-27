package LinkedList;

public class CircularSingleLinkedList {
    private Node tail=null;
    private int size=0;

    public int size() {
        return size;
    }
    public Node last(){
        return tail;
    }
    public Node first(){
        return tail.getNext();
    }
    public void addFirst(Node n){
        if(isEmpty()){
            tail=n;
            tail.setNext(tail);
        }else{
            n.setNext(tail.getNext()); //new head
            tail.setNext(n); // linked to head
        }
        size++;
    }
    public void addLast(Node n){
        addFirst(n);
        tail=tail.getNext();
    }
    public void rotate(){
        if(!isEmpty()){
            tail=tail.getNext();
        }
    }
    public Node removeFromFirst(){
        Node e=null;
        if(!isEmpty()){
            if(size==1)tail=null;
            else {
                e=tail.getNext();
                tail.setNext(e.getNext());
            }
        }
        return e;
    }
    public void printList(){
        if(!isEmpty()){
            Node head=tail.getNext(); //get head
            while (head!=tail){
                System.out.printf("%d \t",head.getData());
                head=head.getNext();
            }
            System.out.printf("%d \t",head.getData());
            System.out.println();
        }
    }
    boolean isEmpty(){
        return tail == null;
    }
}
