package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PractiseStreamAPI{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 4, 5, 6);
        Stream<Integer> streamList = numbers.stream();
        List<Integer> filterdList = streamList.filter(n -> n % 2 == 0).collect(Collectors.toList());
        for(Integer i : filterdList){
            System.out.println(i);
        }
    }
}

