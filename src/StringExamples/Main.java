package StringExamples;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        String a = "Hello";   // Hello
//        String b = "Hello";
//
//        System.out.println(a==b);
//        System.out.println(a.equals(b));


        String c = new String("World");
        String d = new String("World");

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        System.out.println(c==d);
        System.out.println(c.equals(d));


    }
}
