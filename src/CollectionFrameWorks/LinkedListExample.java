package CollectionFrameWorks;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> newLinkedList = new LinkedList<>
                (Arrays.asList("Cat","Dog","Elephant"));
        newLinkedList.add("snake");
        newLinkedList.add(2,"Tiger");
        newLinkedList.addFirst("rabbit");
        newLinkedList.addLast("bear");
        System.out.println(newLinkedList);
    }
}
