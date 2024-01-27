package LinkedList;

public class SingleLinkedList {
    private Node head=null;
    private Node tail=null;
    private int size=0;

    public int size() {
        return size;
    }
    public void addFirst(Node n){
        if (this.isEmpty()) {
            head=n;
            tail=head;
        }else{
            n.setNext(head);
            head=n;
        }
        size++;
    }
    public void addLast(Node n){
        if (this.isEmpty()) {
            System.out.println("List is empty. Try to add some.");
        }else{
            tail.setNext(n);
            tail=n;
            size++;
        }
    }
    public Node first(){
        if (!isEmpty()) return head;
        else {
            System.out.println("List is empty.");
            return null;
        }
    }
    public Node last(){
        if (!isEmpty()) return tail;
        else {
            System.out.println("List is empty.");
            return null;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public Node removeFirst(){
        if (this.isEmpty()) {
            System.out.println("List is empty. Try to add some.");
            return null;
        }else{
            Node toRemove=head;
            head=head.getNext();
            if(isEmpty()) tail=head;
            size--;
            return toRemove;
        }
    }
    public Node removeLast(){
        if (this.isEmpty()) {
            System.out.println("List is empty. Try to add some.");
            return null;
        }else{
            Node toRemove=tail;
            Node temp=head;
            if(head!=tail){
                while (temp.getNext()!=tail) temp=temp.getNext();
                temp.setNext(null);
                tail=temp;
            }else{
                head=null;
            }

            if(isEmpty()) tail=head;
            size--;
            return toRemove;
        }
    }
    public void add(Node e,int index){

    }
    public Node remove(Node e,int index){
        return null;
    }
    public void printList(){
        Node temp=head;
        while (!isEmpty() && temp!=null){
            System.out.printf("%d \t",temp.getData());
            temp=temp.getNext();
        }
        System.out.println();
    }
}

