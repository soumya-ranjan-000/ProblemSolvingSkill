package CollectionFrameWorks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        // Set<Integer> setOne = new HashSet<>();
        // setOne.add(10);
        // setOne.add(40);
        // setOne.add(20);
        // setOne.add(30);
        // System.out.println("Set: " + setOne.toString());
        
        // SortedSet<Integer> setTwo = new TreeSet<>();
        // setTwo.add(11);
        // setTwo.add(10);
        // setTwo.add(21);
        // setTwo.add(1);
        // setTwo.add(31);
        // System.out.println("SortedSet: " + setTwo.toString());
        // System.out.println(setTwo.last());
        // System.out.println(setTwo.first());
        // System.out.println(setTwo.headSet(11).toString());
        // System.out.println(setTwo.tailSet(11).toString());

        SortedSet<Student> students = new TreeSet<>();
        Student s1 = new Student("soumya",87);
        Student s2 = new Student("raki", 89);
        Student s3 = new Student("viki", 78);
        Student s4 = new Student("shrichandan", 90);
        Student s5 = new Student("sandeep", 85);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students.toString());

        NavigableSet<Integer> setThree = new TreeSet<>();
        setThree.add(11);
        setThree.add(10);
        setThree.add(21);
        setThree.add(1);
        setThree.add(31);

        Collection<String> strings = List.of("one", "two", "three", "four");
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
                iterator.remove();
            }
        }
    
        
    }
}
