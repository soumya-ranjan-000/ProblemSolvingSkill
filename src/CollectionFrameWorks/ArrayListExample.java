package CollectionFrameWorks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,6,1,2,3);
        System.out.println(list);
        list.sort(null); //natural order
        System.out.println(list);

        //descending order
//        list.sort((a,b)->{
//            return b-a;
//        });

        list.sort(new CompareByMark());
        System.out.println(list);

        List<String> names = Arrays.asList("hello", "GoodMorning", "How are you");
        names.sort((a,b)->{
            return b.length() - a.length();
        });
        System.out.println(names);
    }
}

class CompareByMark implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}