package LinkedList;

public class App {
    public static void main(String[] args) {
        /* Single Linked List */
//        SingleLinkedList list=new SingleLinkedList();
//        list.addFirst(new Node(12));
//        list.addFirst(new Node(32));
//        list.addLast(new Node(35));
//        list.addFirst(new Node(5));
//        list.addLast(new Node(9));
//
//        list.printList();
//        System.out.println(list.size());
//        System.out.println(list.last());
//        System.out.println(list.first());
//        System.out.println(list.removeFirst());
//        System.out.println(list.size());
//        list.printList();
//        System.out.println(list.removeLast());
//        System.out.println(list.size());
//        list.printList();
//        System.out.println(list.removeLast());
//        System.out.println(list.size());
//        list.printList();
//        System.out.println(list.removeLast());
//        list.printList();
//        System.out.println(list.removeLast());
//        list.removeLast();
//        System.out.println(list.size());

//        System.out.println(list.removeFirst());
//        list.printList();
//        System.out.println(list.removeFirst());
//        list.printList();
//        System.out.println(list.removeFirst());
//        list.printList();
//        System.out.println(list.removeFirst());
//        list.printList();
//        System.out.println(list.removeFirst());
//        list.removeFirst();

        /* Circular LinkedList Operation */
        /*
        CircularSingleLinkedList cirSingleList=new CircularSingleLinkedList();
        cirSingleList.addFirst(new Node(45));
        cirSingleList.addFirst(new Node(23));
        cirSingleList.addLast(new Node(14));
        cirSingleList.addFirst(new Node(62));

        cirSingleList.printList();
        cirSingleList.rotate();
        cirSingleList.printList();
        cirSingleList.rotate();
        cirSingleList.printList();
        System.out.println(cirSingleList.last());
        System.out.println(cirSingleList.first());
        System.out.println(cirSingleList.size());
        System.out.println(cirSingleList.removeFromFirst());
        cirSingleList.printList();
        */
        
        // doubly linked list
        DoublyLinkedList doublyList=new DoublyLinkedList();
        System.out.println(doublyList.size());
        System.out.println(doublyList.isEmpty());
        doublyList.addFirst(new Node(56));
        System.out.println(doublyList.size());
        System.out.println(doublyList.isEmpty());
        doublyList.addFirst(new Node(34));
        doublyList.addFirst(new Node(12));
        doublyList.printList();
        doublyList.addLast(new Node(45));
        doublyList.addLast(new Node(9));
        doublyList.printList();
        System.out.println(doublyList.size());
        System.out.println(doublyList.first());
        System.out.println(doublyList.last());
        doublyList.removeFirst();
        doublyList.printList();
        System.out.println(doublyList.first());
        doublyList.removeLast();
        doublyList.printList();
        System.out.println(doublyList.last());
        System.out.println(doublyList.size());

    }
}
