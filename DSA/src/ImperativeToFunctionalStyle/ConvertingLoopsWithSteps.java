package ImperativeToFunctionalStyle;

import java.util.stream.IntStream;

public class ConvertingLoopsWithSteps {
    public static void main(String[] args) {

        // Type 1
        for(int i = 0; i < 15; i = i + 3) {
            System.out.println(i);
        }

        IntStream.iterate(0,i->i<15,i->i+3).
                forEach(i -> System.out.println(i));

        IntStream.iterate(0,i->i<15,i->i+3).
                forEach(System.out::println);

        // Type 2
        for(int i = 0;; i = i + 3) {
            if(i > 20) {
                break;
            }
            System.out.println(i);
        }

        IntStream.iterate(0,i -> i+3).takeWhile(i -> i<=20).
                forEach(System.out::println);

        IntStream.range(5,15).takeWhile(i -> i<=10)
                .forEach(System.out::println);

    }
}
