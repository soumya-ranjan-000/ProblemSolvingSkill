package ImperativeToFunctionalStyle;

import java.util.stream.IntStream;

public class ConvertingToSimpleLoops {

    //Type 1
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //convert above for loop to functional style
        IntStream.range(0,5).forEach(n-> System.out.println(n));

    //Type 2
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        IntStream.rangeClosed(0,5).forEach(n-> System.out.println(n));
    }
}
