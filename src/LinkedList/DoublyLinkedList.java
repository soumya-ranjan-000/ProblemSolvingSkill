package LinkedList;

public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();
        head.setNext(tail);
        tail.setPrev(head);
    }

    public int size() {
        return size;
    }

    public void addFirst(Node n) {
        n.setNext(head.getNext());
        n.setPrev(head);
        head.getNext().setPrev(n);
        head.setNext(n);
        size++;
    }

    public void addLast(Node n) {
        n.setPrev(tail.getPrev());
        n.setNext(tail);
        tail.getPrev().setNext(n);
        tail.setPrev(n);
        size++;
    }

    public Node first() {
        if (!isEmpty()) return head.getNext();
        else return null;
    }

    public Node last() {
        if (!isEmpty()) return tail.getPrev();
        else return null;
    }

    public boolean isEmpty() {
        return head.getNext() == tail;
    }

    public Node removeFirst() {
        if (this.isEmpty()) return null;
        Node toRemove = head.getNext();
        head.setNext(toRemove.getNext());
        toRemove.getNext().setPrev(head);
        size--;
        return toRemove;
    }

    public Node removeLast() {
        if (this.isEmpty()) return null;
        Node toRemove = tail.getPrev();
        tail.setPrev(toRemove.getPrev());
        toRemove.getPrev().setNext(tail);
        size--;
        return toRemove;
    }

    public void add(Node e, int index) {

    }

    public Node remove(Node e, int index) {
        return null;
    }

    public void printList() {
        Node temp = head.getNext();
        while (temp.getNext()!=null) {
            System.out.printf("%d \t", temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
    }
}
